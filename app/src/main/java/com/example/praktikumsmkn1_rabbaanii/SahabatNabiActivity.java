package com.example.praktikumsmkn1_rabbaanii;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class SahabatNabiActivity extends AppCompatActivity {

    String[] namasahabat = {
            "Abu bakar as shiddiq",
            "Ali bin Abi tholib",
            "Ukhalid bin Walid",
            "Ummar bin Khattab",
            "Usman bin Affan",
            "Bilal bin rabah",
            "Abbas bin abdul muthalib",
            "Abdullah bin mas'ud",
            "Zubair bin awwam",
            "Abu sufyan bin harits"
    };

    Integer[] gambarsahabat = {
            R.drawable.abu,
            R.drawable.ali,
            R.drawable.khalid,
            R.drawable.umar,
            R.drawable.usman,
            R.drawable.bilal,
            R.drawable.abas,
            R.drawable.masud,
            R.drawable.zubair,
            R.drawable.abusufyan
    };

    String[] subtitle = {
            "-",
            "-",
            "-",
            "-",
            "-",
            "-",
            "-",
            "-",
            "-",
            "-"
    };

    String[] url = {
            "https://islamislami.com/2017/04/23/biografi-lengkap-dan-kisah-inspiratif-abu-bakar-ash-shiddiq-sang-khulafaur-rasyidin/",
            "https://suaramuslim.net/biografi-ali-bin-abi-thalib/",
            "https://edywitanto.wordpress.com/2010/11/29/khalid-ibnul-walid/",
            "https://mahluktermulia.wordpress.com/2010/04/17/umar-bin-khattab/",
            "http://kisahmuslim.com/4066-keutamaan-utsman-bin-affan.html",
            "https://edywitanto.wordpress.com/2010/11/06/bilal-bin-rabah/#more-1427",
            "https://edywitanto.wordpress.com/2010/12/09/abbas-bin-abdul-muthalib/",
            "https://buletinmitsal.wordpress.com/sosok/abdullah-bin-mas%E2%80%99ud/",
            "https://edywitanto.wordpress.com/2010/12/02/zubair-bin-awwam/",
            "https://edywitanto.wordpress.com/2010/12/09/abu-sufyan-bin-harits/"
    };

    ListView list;
    AlertDialog.Builder alert1;
    AlertDialog alert2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sahabat_nabi);

        CustomListAdapter cladapter = new CustomListAdapter(this, namasahabat, subtitle, gambarsahabat);

        list = findViewById(R.id.list1);
        list.setAdapter(cladapter);

    }
}
