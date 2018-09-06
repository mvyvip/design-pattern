package 创建型.原型模式;

/**
 * Created by lt on 2018/9/6 0006.
 */

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author DF
 *原型模式虽然是创建型的模式，但是与工程模式没有关系，从名字即可看出，
 *该模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象。
 *在Java中，复制对象是通过clone()实现的
 */
public class Prototype implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;

    public void print(){
        System.out.println("hello Prototype !!!!!");
    }

    /**
     * 该做法为浅复制
     * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
     */
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }
    /**
     * 深复制
     * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。
     * 简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Prototype deepClone() throws IOException, ClassNotFoundException {

        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Prototype prototype = (Prototype) ois.readObject();
        ois.close();
        bis.close();
        oos.close();
        bos.close();
        return prototype;
    }
    public static void main(String[] args) throws Exception {
        Prototype prototype = new Prototype();
        Prototype prototypeClone = prototype.clone();
        Prototype prototypeDeepClone = prototype.deepClone();
        prototypeClone.print();
        prototypeDeepClone.print();
    }
}

