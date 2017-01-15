package com.pintabestbeers.model;

import android.content.res.Resources;

import com.pintabestbeers.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Adam on 15.01.2017.
 */

public class BeerListData {
    private static final String[] beerNames = {"PINTA Vermont IPA 15,5°","PINTA Kwas Theta 24,7°","PINTA Brett IPA 15,1°","PINTA American Black 12°","PINTA Kwas Epsilon 18°","PINTA FarmHouse 13,1°","PINTA Hoplaaga 15,5°","PINTA Modern Drinking 15,5°","PINTA Son of a Birch 9,0°","PINTA Kwas Gamma 13,1°","PINTA / BdPF Król Lata","PINTA Atak Chmielu 15,1°","PINTA Raj z rajs 19,1°","PINTA I\\'m so horny! 18,0°","PINTA Sanrajza 13,1°","PINTA Hopus Pokus 16,5°","PINTA Quatro 24,7°","PINTA Pierwsza Pomoc 10,5°","PINTA A ja pale ale 12,0°","PINTA Viva la Wita! 16,5°","PINTA Dobry Wieczór 13,1°","PINTA Angielskie Śniadanie 14,0°","PINTA Apetyt na Życie 13,1°","PINTA Czarna Dziura 11,5°","PINTA Dymy Marcowe 13,1°","PINTA Dyniamit 16,5°","PINTA Ognie Szczęścia 11,5°","PINTA Imperator Bałtycki 24,7°","PINTA Oki Doki 11,5°","PINTA Imperium Atakuje 19,1°","PINTA Oto Mata IPA 14°","PINTA Jak w Dym 16,5°","PINTA Koniec Świata 19,1°","PINTA Żytorillo 14,0°","PINTA Stare ALE Jare 14,0°","PINTA Odsiecz Wiedeńska 13,1°"};
    private static final int[] beerBottlesImages = {R.drawable.pinta_vermont_ipa,R.drawable.pinta_kwas_theta,R.drawable.pinta_brett_ipa,R.drawable.pinta_american_black,R.drawable.pinta_kwas_epsilon,R.drawable.pinta_farmhouse,R.drawable.pinta_hoplaaga,R.drawable.pinta_modern_drinking,R.drawable.pinta_son_of_a_birch,R.drawable.pinta_kwas_gamma,R.drawable.pinta_krol_lata_2015,R.drawable.pinta_atak_chmielu,R.drawable.pinta_raj_z_rajs,R.drawable.pinta_i_m_so_horny,R.drawable.pinta_sanrajza,R.drawable.pinta_hopus_pokus,R.drawable.pinta_quatro,R.drawable.pinta_pierwsza_pomoc,R.drawable.pinta_a_ja_pale_ale,R.drawable.pinta_viva_la_vita,R.drawable.pinta_dobry_wieczor,R.drawable.pinta_angielskie_sniadanie,R.drawable.pinta_apetyt_na_zycie,R.drawable.pinta_czarna_dziura,R.drawable.pinta_dymy_marcowe,R.drawable.pinta_dynamit,R.drawable.pinta_ognie_szczescia,R.drawable.pinta_imperator_baltycki,R.drawable.pinta_oki_doki,R.drawable.pinta_imperium_atakuje,R.drawable.pinta_oto_mata,R.drawable.pinta_jak_w_dym,R.drawable.pinta_koniec_swiata,R.drawable.pinto_zytorillo,R.drawable.pinta_stare_ale_jare,R.drawable.pinta_odsiecz_wiedenska};

    public static List<BeerListItem> getBeerListData() {
        //We create new list for our RecyclerView
        List<BeerListItem> data = new ArrayList<>();

        //Now we need to loop through all our data to pair beer names with images
        for (int i = 0; i< beerBottlesImages.length; i++) {
            BeerListItem item = new BeerListItem(beerNames[i], beerBottlesImages[i]);
            data.add(item);
        }

        return data;
    }
}
