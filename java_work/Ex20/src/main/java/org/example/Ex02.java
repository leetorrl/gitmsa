package org.example;

class Board{}
class PBoard extends Board{}
public class Ex02 {
    public static void main(String[] args) {
        Board board = new PBoard(); //자식 객체로 부모 참조
        PBoard pBoard = (PBoard) new Board(); //부모객체로 형변화후 자식객체로 참조는 에러남

        System.out.println("한글나오나");// 파일 ->셋팅 -> 빌드-> 빌드툴->그레들리->설정 둘다 인텔리제이로 변경후 저장
    }
}
