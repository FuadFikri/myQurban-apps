package com.fikri.myqurban.model;

import java.util.ArrayList;

public class HewanData {
    public static String[][] data = new String[][] {
            {"Sapi Limousin", "Jual Sapi Qurban. Sapi jenis limousin merupakan jenis sapi potong atau pedaging yang berasal dari Eropa tepatnya dari Perancis. Sapi ini merupakan sapi pedaging dengan ukuran yang sangat besar dan memiliki volume rumen yang sangat besar sehingga pertumbuhan sapi limousin sangat cepat dan hal ini merupakan salah satu keunggulan dari sapi limousin.","800Kg","56 Juta","https://2.bp.blogspot.com/-W1-n63pCK3M/WXB1u-C3-WI/AAAAAAAAAeU/HS5PkilkO5sLsznnBLb986-9F3bXTrOcACLcBGAs/s1600/harga-sapi-pedaging-2014.gif"},
            {"Sapi Brahman","Sapi brahman merupakan sapi yang berasal dari India. Sapi jenis ini merupakan sapi potong terbaik yang rekomendid untuk dikembangkan dikarenakan kualitasnya lebih baik bila dibandingkan dengan sapi lokal.","1050 Kg","70 Juta","https://2.bp.blogspot.com/-Z__NF6hPj9M/WXB2BYCoXPI/AAAAAAAAAeY/dyOgeast2rcEROcjT1il1AtjILu-JeAkQCLcBGAs/s1600/sapi-brahma.jpg"},
            {"Sapi Ongole","Jual Sapi Qurban. Jenis Ongole. Dijamin sehat dan gemuk. Hubungi SariFarm 0812345678","600 Kg","40 Juta","http://goqurban.com/hewanqurban/wp-content/uploads/2019/07/sapi-qurban-2019-no-sapi-45.jpg"},
            {"Sapi PO","Jual Sapi Qurban. Jenis Peranakan Ongole. Langsung dari peternak. Lokasi Pathuk Gunung Kidul. Monggo Langsung ke kandang","500 Kg","30 Juta","http://goqurban.com/hewanqurban/wp-content/uploads/2019/07/1-300x170.jpg"},
            {"Sapi Jawa","Jual Sapi Jawa. Stok terakhir. Usia 3 tahun. Layak untuk Qurban. Lokasi Magelang. 08122334455","350 Kg","23 Juta","https://ternakonline.files.wordpress.com/2009/09/po-ongole.jpg?w=461"},
            {"Sapi Madura","Jual Sapi Qurban. Usia 2 tahun. Layak untuk Qurban. Lokasi Surabaya. 08122334455","350 Kg","21 Juta","https://upload.wikimedia.org/wikipedia/id/0/09/Sapi_madura.jpg"},
            {"Sapi Bali","Jual Sapi Qurban. Jenis sapi bali. Lokasi lemu-Farm Surabaya. 08122334455","390 Kg","31 Juta","https://s.kaskus.id/r480x480/images/fjb/2018/07/31/sapi_bali_murah_untuk_qurban_2018_6513711_1533023129.jpg"},
            {"Sapi Sumba","Jual Sapi Qurban. Jenis sapi sumbawa. Sapi sumbawa merupakan salah satu rumpun sapi lokal Indonesia yang mempunyai sebaran asli geografis di Provinsi Nusa Tenggara Barat 08122334455","390 Kg","28 Juta","data:image/jpeg;base64,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"},
            {"Sapi Belgian Blue","Sapi ini merupakan jenis sapi unggul berbadan bongsor yang menjanjikan jumlah karakas hingga 73%. Pada umumnya ternak sapi potong di Indonesia hanya memiliki karkas dibawah 60%. 08122334455","390 Kg","28 Juta","data:image/jpeg;base64,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"},
            {"Sapi Angus","Sapi angus menjadi salah-satu spesies sapi potong yang terkenal. Biasanya dimanfaatkan di kawasan Australasia dan Eropa. 08122334455","390 Kg","28 Juta","data:image/jpeg;base64,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"},
    };

    public static ArrayList<Hewan> getListData(){
        ArrayList<Hewan> list = new ArrayList<>();
        for (String[] aData : data) {
            Hewan sapi = new Hewan();
            sapi.setJenis(aData[0]);
            sapi.setDeskripsi(aData[1]);
            sapi.setBobot(aData[2]);
            sapi.setHarga(aData[3]);
            sapi.setPhoto(aData[4]);

            list.add(sapi);
        }
        return list;
    }
}