package org.example;


import java.util.stream.IntStream;
import java.util.stream.Stream;

class Person {
    private int kor;
    private int eng;
    private int math;

    public Person(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "Person{" +
                "kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}';
    }
}
    public class Ex05 {

        public static void main(String[] args) {

            Stream<Person> ss = Stream.of(new Person(100,90,80),
                    new Person(90,80,70),
                    new Person(60,70,80)
                    );

            IntStream is = ss.flatMapToInt( a -> IntStream.of(a.getEng(),a.getKor(), a.getMath()));

            System.out.println("total = "+is.sum());

            ss = Stream.of(new Person(100,90,80),
                    new Person(90,80,70),
                    new Person(60,70,80)
            );
            is = ss.flatMapToInt( a -> IntStream.of(a.getEng(),a.getKor(), a.getMath()));

            System.out.println("평균 = "+ is.average().getAsDouble());

            ss = Stream.of(new Person(100,90,80),
                    new Person(90,80,70),
                    new Person(60,70,80)
            );
            is = ss.flatMapToInt( a -> IntStream.of(a.getEng(),a.getKor(), a.getMath()));

            System.out.println("최대 = "+ is.max().getAsInt());

            ss = Stream.of(new Person(100,90,80),
                    new Person(90,80,70),
                    new Person(60,70,80)
            );
            is = ss.flatMapToInt(person -> IntStream.of(person.getEng(),person.getKor(), person.getMath()));

            double avg = is.average().orElse(0);
            System.out.println("avg = "+avg);

        }
    }
