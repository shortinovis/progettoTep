package com.example.versionefinaletep;

public class Aereoporto {
    public static void main(String[] args) {
            Aerei a1=new Aerei("alyanz", "volo");
            Aerei a2=new Aerei("alitalia","attesapartenza");
            Aerei a3=new Aerei("ryanar","attesapartenza");
            Aerei a4=new Aerei("easyget","attesa");
            Aerei a5=new Aerei("scarnagas","volo");
            Aerei a6=new Aerei("sbenzus","volo");
            Aerei a7=new Aerei("AmbriolaCompany","attesaatterraggio");
            Aerei a8=new Aerei("FullBox","attesa");
            Aerei a9=new Aerei("dordi","attesa");
            Aerei a10=new Aerei("mollyrosa","attesaatterraggio");

            a1.start();
            a2.start();
            a3.start();
            a4.start();
            a5.start();
            a6.start();
            a7.start();
            a8.start();
            a9.start();
            a10.start();
        }
    }
