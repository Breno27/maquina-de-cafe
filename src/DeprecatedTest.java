//import br.com.cafegoxtoso.domain.Menu;
//
//
//public class DeprecatedTest {
//    public static void main(String[] args) {
//        Menu menu = new Menu();
//        Cafe cafeAmericano = new Cafe(1, "Americano", 7);
//        Cafe cafeExpresso = new Cafe(2, "Expresso", 7);
//        Cafe cafeCapuccino = new Cafe(3, "Capuccino", 10);
//        Cafe cafeMachiato = new Cafe(4, "Machiato", 12);
//        Cafe cafeLatte = new Cafe(5, "Café Latte", 10);
//        Cafe cafeMocha = new Cafe(6, "Café Mocha", 10);
//        Cafe cafeDescafeinado = new Cafe(7, "Descafeinado", 10);
//        Cafe cafeChocolate = new Cafe(8, "Chocolate", 10);
//
//        menu.adicionaCafe(cafeAmericano);
//        menu.adicionaCafe(cafeExpresso);
//        menu.adicionaCafe(cafeCapuccino);
//        menu.adicionaCafe(cafeMachiato);
//        menu.adicionaCafe(cafeLatte);
//        menu.adicionaCafe(cafeMocha);
//        menu.adicionaCafe(cafeDescafeinado);
//        menu.adicionaCafe(cafeChocolate);
//
//        System.out.println("Bom dia, seja bem vindo ao café goxtoso, este é o nosso menu, digite a opção desejada ou o número 0 para sair:\n");
//        menu.getCafes().forEach(System.out::println);
//        List<Cafe> cafesDoPedido = new ArrayList<>();
//        String mensagemPadraoEscolhas = "caso deseje outro café só digitar o numero correspondente ou 0 para sair.";
//        int opcao = -1;
//
//        while (opcao != 0) {
//
//            Scanner scan = new Scanner(System.in);
//            opcao = scan.nextInt();
//
//            switch (opcao) {
//                case 1, 2, 3, 4, 5, 6, 7, 8:
//                    System.out.println(menu.getCafes().get(opcao-1).getNome() + " adicionado ao pedido!");
//                    cafesDoPedido.add(menu.getCafes().get(opcao-1));
//                    System.out.println(mensagemPadraoEscolhas);
//                    break;
//                default:
//                    System.out.println("escolha uma opção válida ou 0 para finalizar");
//            }
//        }
//
//        System.out.println("pedido finalizado!\n");
//
//        System.out.println("Cafés pedidos:\n");
//        cafesDoPedido.forEach(System.out::println);
//
//        float valorTotalPedido = 0;
//        for (Cafe cafe: cafesDoPedido) {
//            valorTotalPedido += cafe.getValor();
//        }
//
////        System.out.println("\nTotal: " + valorTotalPedido);
//    }
//}