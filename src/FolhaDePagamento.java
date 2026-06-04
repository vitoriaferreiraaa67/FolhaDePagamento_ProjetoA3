 import java.util.Locale;
 import java.util.Scanner;
 import java.util.ArrayList;

 public class FolhaDePagamento {

  static final double SALARIO_BASE = 2000.00;

 public static void main(String[] args) {
  Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
  ArrayList<String> funcionarios = new ArrayList<>();
  ArrayList<Integer> matriculas = new ArrayList<>();

 int opcao;

 do {

 System.out.println("==== MENU ====");
  System.out.println("Opção 1 - Funcionário Padrão");
  System.out.println("Opção 2 - Funcionário Comissionado");
  System.out.println("Opção 3 - Funcionário de Produção");
  System.out.println("Opção 4 - Gerar Folha de Pagamento");
  System.out.println("Opção 0 - Sair do Programa");
  opcao = leitor.nextInt();
  leitor.nextLine();

  switch (opcao) {

  case 1:
 funcionarioPadrao(leitor, funcionarios, matriculas);
 break;
  case 2:
  funcionarioComissionado(leitor, funcionarios, matriculas);
 break;

  case 3:
  funcionarioDeProducao(leitor, funcionarios, matriculas);
  break;

 case 4:
 folhaPagamento(funcionarios);
 break;

  case 0:
  break;

  default:
  System.out.println("Opção inválida");
 break;
  }
 } while (opcao != 0); // O PROGRAMA REPETE QUANDO A OPÇÃO NÃO FOR 0

  System.out.println("Encerrando...");
  leitor.close();
  }


  public static void funcionarioPadrao(Scanner leitor, ArrayList<String> funcionarios, ArrayList<Integer> matriculas) {

  System.out.println("Digite o Nome: ");
  String nome = leitor.nextLine();

 System.out.println("Digite a Matricula:");
  int matriculaFuncionario = leitor.nextInt();

  while (matriculaFuncionario <= 0) {
  System.out.println("Matrícula inválida. Digite novamente:");
  matriculaFuncionario = leitor.nextInt();
  }
  if (!cadastrarMatricula(matriculaFuncionario, matriculas)) {
  return; // Cancela o cadastro se a matrícula já existir
  }

  leitor.nextLine();

  double salarioFinal = SALARIO_BASE;

 String informacoesFuncionario =
 "Funcionário Padrão\n" +
  " | " + "Nome: " + nome + "\n" +
 " | " + "Matrícula: " + matriculaFuncionario + "\n" +
 " | " + "Salário Base: " + String.format("R$ %.2f", SALARIO_BASE) + "\n" +
  " | " + "Extras: R$ 0.00" + "\n" +
  " | " + "Salário Final: " + String.format("R$ %.2f", salarioFinal) + "\n" +
  "============================";
  funcionarios.add(informacoesFuncionario);
  System.out.println("Funcionário cadastrado com sucesso!");
  }

 public static void funcionarioComissionado(Scanner leitor, ArrayList<String> funcionarios, ArrayList<Integer> matriculas) {

  System.out.println("Digite o nome:");
  String nome = leitor.nextLine();

 System.out.println("Digite a Matrícula:");
  int matriculaFuncionario = leitor.nextInt();

  while (matriculaFuncionario <= 0) {
  System.out.println("Matrícula inválida. Digite novamente:");
  matriculaFuncionario = leitor.nextInt();
  }
  if (!cadastrarMatricula(matriculaFuncionario, matriculas)) {
  return; // Cancela o cadastro se a matrícula já existir
  }
  leitor.nextLine();

  System.out.println("Informe o valor de vendas: ");
  double valorVendas = leitor.nextDouble();

  while (valorVendas < 0) {
 System.out.println("Valor de vendas não pode ser negativo. Digite novamente:");
 valorVendas = leitor.nextDouble();
  }
  leitor.nextLine();

 System.out.println("Infome o percentual de comissão:");
  double percentualComissao = leitor.nextDouble();

  while (percentualComissao < 0) {
 System.out.println("Percentual de comissão não pode ser negativo. Digite novamente:");
  percentualComissao = leitor.nextDouble();
 }
  leitor.nextLine();

 double comissao = valorVendas * percentualComissao / 100;
  double salarioFinal = SALARIO_BASE + comissao;

  String informacoesFuncionario =
  "Funcionário Comissionado\n" +
  " | " + "Nome: " + nome + "\n" +
  " | " + "Matrícula: " + matriculaFuncionario + "\n" +
  " | " + "Salário Base: " + String.format("R$ %.2f", SALARIO_BASE) + "\n" +
  " | " + "Comissão: " + String.format("R$ %.2f", comissao) + "\n" +
  " | " + "Salário Final: " + String.format("R$ %.2f", salarioFinal) + "\n" +
  "============================";
  funcionarios.add(informacoesFuncionario);
  System.out.println("Funcionário cadastrado com sucesso!");
 }

  public static void funcionarioDeProducao(Scanner leitor, ArrayList<String> funcionarios, ArrayList<Integer> matriculas) {

  System.out.println("Digite o nome:");
 String nome = leitor.nextLine();

  System.out.println("Digite a Matrícula:");
  int matriculaFuncionario = leitor.nextInt();

  while (matriculaFuncionario <= 0) {
  System.out.println("Matrícula inválida. Digite novamente:");
  matriculaFuncionario = leitor.nextInt();
  }
  if (!cadastrarMatricula(matriculaFuncionario, matriculas)) {
 return; // Cancela o cadastro se a matrícula já existir
  }
 leitor.nextLine();
  System.out.println("Informe a quantidade de peças produzidas:");
  int quantidadePecasProduzidas = leitor.nextInt();

  while (quantidadePecasProduzidas < 0) {
  System.out.println("Quantidade de peças produzidas não pode ser negativa. Digite novamente:");
  quantidadePecasProduzidas = leitor.nextInt();
  }
 leitor.nextLine();

 System.out.println("Informe o valor por peça:");
  double valorPorPeca = leitor.nextDouble();

  while (valorPorPeca < 0) {
  System.out.println("Valor por peça não pode ser negativo. Digite novamente:");
  valorPorPeca = leitor.nextDouble();
 }
 leitor.nextLine();

  double bonusProdutividade = quantidadePecasProduzidas * valorPorPeca;
  double salarioFinal = SALARIO_BASE + bonusProdutividade;
 String informacoesFuncionario =
  "Funcionário de Produção\n" +
  " | " + "Nome: " + nome + "\n" +
  " | " + "Matrícula: " + matriculaFuncionario + "\n" +
  " | " + "Salário Base: " + String.format("R$ %.2f", SALARIO_BASE) + "\n" +
  " | " + "Bônus de Produtividade: " + String.format("R$ %.2f", bonusProdutividade) + "\n" +
  " | " + "Salário Final: " + String.format("R$ %.2f", salarioFinal) + "\n" +
  "====================================";
 funcionarios.add(informacoesFuncionario);
 System.out.println("Funcionário cadastrado com sucesso!");
  }

  public static boolean cadastrarMatricula(int matricula, ArrayList<Integer> matriculas) {
  if (matriculas.contains(matricula)) { // A matricula ja esta cadastrada
  System.out.println("Matrícula já cadastrada! Operação cancelada.");
 return false; // Porque não conseguiu cadastrar a matricula, pois ela ja está cadastrada
  } else {
  matriculas.add(matricula);
  return true; // conseguiu cadastrar a matricula
 }
  }

  public static void folhaPagamento(ArrayList<String> funcionarios) {

 if (funcionarios.isEmpty()) {
 System.out.println("Nenhum funcionário encontrado.");
  return;
  }

  System.out.println("\n==== FOLHA DE PAGAMENTO ====\n");
  for (String funcionario : funcionarios) {
 System.out.println(funcionario);
  }

  }

 }