package org.example;

class ContInfo {
    int phone;
    String addres;

    public ContInfo(int phone, String addres) {
        this.phone = phone;
        this.addres = addres;
    }

    public int getPhone() {
        return phone;
    }

    public String getAddres() {
        return addres;
    }
}

    public class Ex05 {

    public static void main(String[] args) {

        ContInfo contInfo = new ContInfo(1076759635,"KOREA DAEGU");

        int phone = 0;
        String address = null;

        if(contInfo.getPhone() !=0)
            phone = contInfo.getPhone();

        else
            phone = 0;

        if(contInfo.getAddres() !=null)
            address = contInfo.getAddres();

        else
            address = "EMPTY";

        System.out.println(phone);
        System.out.println(address);
        }
    }

