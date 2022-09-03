package the.java.manipulation.bytecode;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.pool.TypePool;

import java.io.File;
import java.io.IOException;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class Masulsa {

    public static void main(String[] args) {
        //bytecode 조작 1)
        //        try {
//            new ByteBuddy().redefine(Moja.class)
//                    .method(named("pullOut")).intercept(FixedValue.value("Rabbit!"))
//                    .make().saveIn(new File("/Users/bakhyeongjin/javaWorkspace/bakcoder-java-study/target/classes/"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(new Moja().pullOut());

        //bytecode 조작 2)
//        ClassLoader classLoader = Masulsa.class.getClassLoader();
//        TypePool typePool = TypePool.Default.of(classLoader);
//
//        try {
//            new ByteBuddy().redefine(
//                    typePool.describe("the.java.manipulation.bytecode.Moja").resolve(),
//                    ClassFileLocator.ForClassLoader.of(classLoader))
//                    .method(named("pullOut")).intercept(FixedValue.value("Rabbit!"))
//                    .make().saveIn(new File("/Users/bakhyeongjin/javaWorkspace/bakcoder-java-study/target/classes/"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println(new Moja().pullOut());
    }
}
