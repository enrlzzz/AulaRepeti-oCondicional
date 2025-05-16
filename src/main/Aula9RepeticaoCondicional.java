package main;
	
import java.util.Scanner;

public class Aula9RepeticaoCondicional {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
            int opcao; 
            do {
                System.out.println("\n=== MENU DE EXERCICIOS ===");
                System.out.println("1. Somar numero ate digitar negativo");
                System.out.println("2. Calcular media ate digitar zero");
                System.out.println("3. Somar ate passar dos 100");
                System.out.println("4. Validacao Senha");
                System.out.println("5. Maquina de Vendas");
                System.out.println("6. Calcular Fatorial");
                System.out.println("7. Calculadora (do...while)");
                System.out.println("0. Sair");
                System.out.println("Escolha uma opcao: ");
                
                while (!sc.hasNextInt()) {
                    System.out.println("Por favor, digite um número válido: ");
                    sc.next();
                } 
                
                opcao = sc.nextInt();
                switch (opcao) {
                    case 1 -> SomarAteNegativo(sc);
                    case 2 -> MediaAteZero(sc);
                    case 3 -> SomaMaiorQue100(sc);
                    case 4 -> ValidarSenha(sc);
                    case 5 -> MaquinaDeVendas(sc);
                    case 6 -> CalculadoraFatorial(sc);
                    case 7 -> Calculadora(sc);
                    case 0 -> System.out.println("Encerrando o programa. Até logo!");
                    
                    default -> System.out.println("Opção inválida. Tente novamente.");
                }
                
            } 
        
                while (opcao !=0);
                sc.close();
            
    }

                public static void SomarAteNegativo(Scanner sc) {
                    int numero, soma = 0;
                    System.out.println("Digite números positivos para somar. Digite um número negativo para parar");
                    while (true) {
                        System.out.println("Digite um número: ");
                        while (!sc.hasNextInt()) {
                            System.out.println("Por favor, digite um número inteiro: ");
                            sc.next();
                        }
                        
                        numero = sc.nextInt();
                        if (numero < 0)
                            break;	
                    }
                    
                    System.out.println("Soma total: " + soma);
                }
                
                    public static void MediaAteZero(Scanner sc) {
                        int numero, soma = 0, contador = 0;
                        System.out.println("Digite números para calcular a média. Digite (0) para parar.");
                        while (true) {
                            System.out.println("Digite um número: ");
                            while (!sc.hasNextInt()) {
                                System.out.println("Por favor, digite um número inteiro: ");
                                sc.next();
                            }
                            
                            numero = sc.nextInt();
                            if (numero < 0)
                                break;	
                            
                            soma += numero;
                            contador++;
                        }
                        
                            if (contador > 0) {
                                double media = (double) soma / contador;
                                System.out.println("Média " + media);
                            } else {
                                System.out.println("Nenhum número válido foi digitado.");
                            }
                    }
                      
                    public static void SomaMaiorQue100(Scanner sc) {
                        int numero, soma = 0;
                        System.out.println("Digite números até a soma ultrapassar 100.");
                        while (soma <= 100) {
                            System.out.println("Digite um número: ");
                            while (!sc.hasNextInt()) {
                                System.out.println("Por favor, digite um número inteiro: ");
                                sc.next();
                            }
                            
                            numero = sc.nextInt();
                            soma += numero;
                        }
                        
                            System.out.println("Soma final: " + soma);
                        
                    }
                    
                    public static void ValidarSenha(Scanner sc) {
                        final String SENHA_CORRETA = "Facens123";
                        String senhaDigitada;
                        do {
                            
                            System.out.println("Senha:  ");
                            senhaDigitada = sc.next();
                            
                        } while (!senhaDigitada.equals(SENHA_CORRETA));
                        
                        System.out.println("Acesso liberado! Senha correta.");
                        
                    }
                    
                    public static void MaquinaDeVendas(Scanner sc) {
                        double precoProduto = 7.50;
                        double pagamentoTotal = 0.0;
                        System.out.println("produto custa R$ " + precoProduto);
                        System.out.println("Insira moedas ou notas até completar o valor.");
                        
                        while (pagamentoTotal < precoProduto) {
                            System.out.println("Insira valor: R$ ");
                            while (!sc.hasNextDouble()) {
                                System.out.println("Por favor digite um valor válido: R$ ");
                                sc.next();
                            }
                            
                            double valor = sc.nextDouble();
                            if (valor <= 0) {
                                System.out.println("Valor inválido. Insira um valor positivo.");
                                continue;
                            }
                            pagamentoTotal += valor;
                        }
                        
                        double troco = pagamentoTotal - precoProduto;
                        System.out.printf("Compra concluída! Troco: R$ %.2f\n", troco);
                        
                    }
                    
                    public static void CalculadoraFatorial(Scanner sc) {
                        
                        System.out.println("Digite um número para calcular o fatorial:  ");
                        while (!sc.hasNextInt()) {
                            System.out.println("Por favor digite um número válido: ");
                            sc.next();
                        }
                        
                        int numero = sc.nextInt();
                        if(numero < 0) {
                            System.out.println("Não existe fatorial de um número negativo");
                        }
                        
                        int resultado = 1;
                        int i = numero;
                        while(i>1) {
                            resultado *=i;
                            i--;
                        }
                        
                        System.out.println("Fatorial de " + numero + " é: " + resultado);
                        
                    }
                    
                    public static void Calculadora(Scanner sc) {
                        char continuar;
                        do {
                            System.out.println("Digite o primeiro número:  ");
                            while (!sc.hasNextDouble()) {
                                System.out.println("Por favor, digite um número válida:  ");
                                sc.next();
                            }
                            
                            double num1 = sc.nextDouble();
                            System.out.println("Digite o segundo número:  ");
                            while (!sc.hasNextDouble()) {
                                System.out.println("Por favor, digite um número válido:  ");
                                sc.next();
                            }
                            
                            double num2 = sc.nextDouble();
                            System.out.println("Escolha a operação (+, -, *, /)");
                            String opStr = sc.next();
                            char operacao = opStr.length() > 0 ? opStr.charAt(0) : ' ';
                            switch (operacao) {
                                case '+' -> System.out.println("Resultado:  " + (num1 + num2));
                                case '-' -> System.out.println("Resultado:  " + (num1 - num2));
                                case '*' -> System.out.println("Resultado:  " + (num1 + num2));
                                case '/' -> {
                                    if (num2 != 0)
                                        System.out.println("Resultado: " + (num1 / num2));
                                    
                                    else
                                        System.err.println("Erro: divisão por zero");
                                }
                                
                                default -> System.out.println("Operação inválida!");
                
                            }
                            
                            System.out.println("Deseja continuar? (s/n):  ");
                            String resp = sc.next();
                            continuar 
                             = resp.length() > 0 ? resp.charAt(0) : 'n';
                             
                        } while (continuar == 's' || continuar == 'S'); 
                    }			
                }
