import br.com.cafegoxtoso.domain.Cafes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UmDoisTresTestando {
    public static void main(String[] args) {
        System.out.println("Bom dia, seja bem vindo ao café goxtoso, este é o nosso menu, digite a opção desejada ou o número 0 para sair:\n");

        for(Cafes cafe: Cafes.values()) {
            System.out.println(cafe.getCodigo() + " " + cafe.getNome() + " " + cafe.getValor());
        }

        String mensagemPadraoEscolhas = "caso deseje outro, digite o numero correspondente ou zero para sair.";
        List<Cafes> cafesDoPedido = new ArrayList<>();
        int opcao = -1;

        List<Cafes> listaDeCafes = List.of(Cafes.values());
        Scanner scan = new Scanner(System.in);

        while((opcao = scan.nextInt()) != 0) {

            try {
                if (listaDeCafes.get(opcao-1) != null) {
                    cafesDoPedido.add(listaDeCafes.get(opcao-1));
                    System.out.println(mensagemPadraoEscolhas);
                }
            } catch (Exception e) {
                System.out.println("escolha uma opção válida ou 0 para finalizar");
            }
        }

        System.out.println("pedido finalizado!\n");

        System.out.println("Cafés pedidos:\n");
        cafesDoPedido.forEach(System.out::println);

        double valorTotalPedido = cafesDoPedido.stream().mapToDouble(Cafes::getValor).sum();

        System.out.println("\nTotal: " + valorTotalPedido);

    }
}
