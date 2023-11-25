import br.com.cafegoxtoso.domain.Cafes;
import br.com.cafegoxtoso.domain.MensagensAtendimento;
import br.com.cafegoxtoso.domain.SomaListaCafe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class UmDoisTresTestando {
    public static void main(String[] args) {
        MensagensAtendimento.INICIO_ATENDIMENTO.printMensagem();

        List<Cafes> cafes = List.of(Cafes.values());
        cafes.forEach(System.out::println);

        List<Cafes> cafesDoPedido = new ArrayList<>();
        int opcao = -1;

        Scanner scan = new Scanner(System.in);

        while((opcao = scan.nextInt()) != 0) {

            try {
                if (cafes.get(opcao-1) != null) {
                    cafesDoPedido.add(cafes.get(opcao-1));

                    MensagensAtendimento.PADRAO_ERRO_ESCOLHA.printMensagem();
                }

            } catch (Exception e) {
                MensagensAtendimento.PADRAO_ERRO_ESCOLHA.printMensagem();
            }
        }

        MensagensAtendimento.FINALIZANDO_PEDIDO.printMensagem();

        cafesDoPedido.sort(Comparator.comparing(Cafes::getCodigo));
        cafesDoPedido.forEach(System.out::println);

        SomaListaCafe soma = new SomaListaCafe();
        double valorTotalPedido = soma.somaCafes(cafesDoPedido);

        System.out.println("\nTotal: " + valorTotalPedido);
    }
}
