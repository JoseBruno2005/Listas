package Main;

import Model.ListaDeDesejos;
import Model.ProdutoModel;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ListaDeDesejos<ProdutoModel> listadedesejos = new ListaDeDesejos<>();

        ProdutoModel p1 =  new ProdutoModel("Arroz", 4.80F, 2,30);

        listadedesejos.add(p1);

        System.out.println(listadedesejos.get(0));

        System.out.println(listadedesejos.size());

        System.out.println(listadedesejos);

        listadedesejos.remove(p1);

        System.out.println(listadedesejos);

        System.out.println(listadedesejos.size());

    }
}
