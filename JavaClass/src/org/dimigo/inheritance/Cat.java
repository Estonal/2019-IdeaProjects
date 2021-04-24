package org.dimigo.inheritance;


    public class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }
        //부모클랫의 메소드를 자식 클래스에서 재정의함.
        // 메소드 오버라이딩
        @Override
        public void bark() {
            System.out.println("야옹");
        }


        public void scratch() {
            System.out.println(name + "이 할큅니다.");
        }
    }
