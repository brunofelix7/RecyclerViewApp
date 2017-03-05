package br.com.sample.recyclerviewapp.model;


import java.util.ArrayList;
import java.util.List;

import br.com.sample.recyclerviewapp.R;

/**
 * Essa classe representa a imitação os seus dados, que estariamos recebendo do SQLite ou WebService por exemplo
 */
public class MyData {

    //  LISTA DE NOMES QUE VÃO APARECER NO RECYCLERVIEW
    //  SERÁ O MEU ARRAY QUE ESTÁ VINDO DA API
    private static final String[] titles = {
            "Title 1",
            "Title 2",
            "Title 3",
            "Title 4",
            "Title 5",
            "Title 6"
    };

    private static final String[] subTitles = {
            "Description 1",
            "Description 2",
            "Description 3",
            "Description 4",
            "Description 5",
            "Description 6"
    };

    private static final int[] icon = {
            R.drawable.ic_airport_shuttle_black_24dp
    };

    //  REPRESENTA OS RECURSOS DE IMAGEM
    private static final int[] icons = {
            android.R.drawable.ic_menu_camera,
            android.R.drawable.ic_menu_call,
            android.R.drawable.ic_menu_mylocation,
            android.R.drawable.ic_menu_mylocation,
            android.R.drawable.ic_menu_mylocation,
            android.R.drawable.ic_menu_mylocation
    };


    /**
     * Este seria meu método que retorna minha Lista de Data pegando pelo requesterId
     * @return List<Data>
     */
    public static List<ListItem> getListData(){
        List<ListItem> data = new ArrayList<>();

        //  ADICIONA NO RECYCLERVIEW TODAS AS NOSSAS LISTAS
        for(int i = 0; i < titles.length; i++){
            ListItem item = new ListItem();
            item.setTitle(titles[i]);
            item.setSubTitle(subTitles[i]);
            //item.setImageResId(icons[i]);
            data.add(item);
        }
        return data;
    }

}
