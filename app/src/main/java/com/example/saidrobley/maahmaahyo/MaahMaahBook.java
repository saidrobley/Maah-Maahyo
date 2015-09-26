package com.example.saidrobley.maahmaahyo;

import java.util.Random;

/**
 * Created by saidrobley on 4/30/15.
 */
    public class MaahMaahBook {
    public int i = 0;
    private int currentIndex = 0;


    // maahMaah hold each maahmaah in an array
    public String [] maahMaah = { "Saddex Derriskaa Kugu Naca:\n\n" +
            "1) Been baddan.\n" +
            "2) Baryo baddan.\n" +
            "3) Bukaan baddan.",

            "Saddex Waa la Isku Naca:\n\n" +
            "1) Baryo baddan.\n" +
            "2) Baahi badan.\n" +
            "3) Bukaan badan.",

             "Saddex Midna Faa’iido Ma Leh:\n\n"+
                "1) Fidhiqle rag.\n" +
                "2) Fudeeyd haween.\n" +
                "3) Fadhiya geel.",

            "Saddex Baa Rag ugu Darran:\n\n" +
                "1) Nin maqan oon la tebin.\n"+
                "2) Nin jooga oon la tirsan. \n" +
                "3) Nin tagaya oon la cellin.",

            "Sadex nin waligaa magaartid\n\n" +
                    "1) Ninka kaa faras dheereeya maalin ma gaartid\n" +
                    "2) Ninka kaa daaqsin fiican sanad kuma gaartid\n" +
                    "3) Nin kaa naag fiicanna waligaa ma gaartid.",

            "Saddex markaan bartaan ka gaboobay:\n\n"+
                    "1) Dab ollolintiis \n"+
                    "2) Carruur aamusinteed \n" +
                     "3) Iyo awr carraabintiis. \n",

            "Seddex seddex baa laga helaa\n\n" +
                    "1) Dadaal dheefbaa laga helaa\n" +
                    "2) Deeqsinimo ammaan baa laga helaa\n" +
                    "3) Daandaansi dagaal baa laga helaa",

            "Seddex daawo loo waa\n\n" +
                    "1) Doqoniimo daawo loo waa\n" +
                    "2) Da’da na daawo loo waa\n" +
                    "3) Dumar dayntoodna daawo loo waa",

            "Seddex seddex bay weheshadaan\n\n" +
                    "1) Wadaad wardi buu weheshadaa\n" +
                    "2) Wiil yari hooyadii buu weheshadaa\n" +
                    "3) Waayeel wadankiisuu weheshadaa",

            "Saddex lalama rafiiqo:\n\n" +
                    "1) Nin aan run aqoon \n" +
                    "2) Nin aan rabbi aqoon\n" +
                    "3) Nin aan rag aqoon.",

            "Saddex faankoodu waa been:\n\n" +
                    "1) Bakhayl \n" +
                    "2) Fuley \n" +
                    "3) Iyo Beenaale.",

            "Saddex saddex bay ku baraan:\n\n" +
                    "1) Baahidu ducadey ku bartaa,\n" +
                    "2) Bentuna faankay ku bartaa,\n" +
                    "3) Baryaduna fadhi bay ku bartaa.",

            "Saddex lalama colloobo:\n\n" +
                    "1) Nin cagtaada yaqaan\n" +
                    "2) Nin codkaaga yaqaan\n" +
                    "3) Iyo nin ciddaada yaqaan",

            "Gartu sideedaba waa saddex heer:\n\n" +
                    "1) Waa mar aad garan weydo\n" +
                    "2) Mar aad gaari weydo\n" +
                    "3) Iyo mar ay kula gudboontahay",

            "Saddex saddex ayaa lagu gudaa:\n\n" +
                    "1) Saan saan ayaa lagu gudaa\n" +
                    "2) Saxan saxan ayaa lagu gudaa \n" +
                    "3) Salaan salaan ayaa lagu gudaa",

            "Saddex Baa Boqornimada Kaa Qaadda: \n\n" +
                    "1) Gar weecsan\n" +
                    "2) Gacan gudhan\n" +
                    "3) Guddoon jillicsan."







};

    public String getMaahMaah(){
        String maah = "";
        //Random randomGenerator = new Random();
        //nt random = randomGenerator.nextInt(maahMaah.length);

        // maah = maahMaah[random];
         currentIndex = (currentIndex ) % maahMaah.length;
         maah = maahMaah[currentIndex];
         currentIndex++;
         return maah;

    }

}
