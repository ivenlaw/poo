package ExercicioJava8;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Numeros {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 5, 8, 7, 4, 1, 6, 3, 2, 1, 8, 5, 7, 4);
		
//		01. imprima todos os itens da lista no console
		
		System.out.println(numbers.toString());
		
//	    02. imprima os números distintos em ordem crescente
		
		System.out.println(numbers.stream()
				.distinct()
				.sorted()
				.toList());
		
//	    03. imprima os números impares  e distintos em ordem decrescente
		
		System.out.println(numbers.stream()
				.distinct()
				.filter(n -> (n%2 == 0))
				.sorted(Comparator.reverseOrder())
				.toList());
		
//	    04. imprima a soma dos números ignorando os 3 primeiros
		
		System.out.println(numbers.stream()
				.skip(3)
				.mapToInt(Integer::intValue)
				.sum());
		
//	    05. imprima cada número da lista multiplicado por 2
		
		numbers.stream()
		.map(n -> n*2)
		.forEach(System.out::println);
		
//	    06. imprima de forma agrupada os números pares e impares distintos
		
		Map<Boolean, List<Integer>> groupedNumbers = numbers.stream()
                .distinct() // Remove duplicatas
                .collect(Collectors.
                		partitioningBy(num -> num % 2 == 0)); // Agrupa os números em dois grupos: pares e ímpares
        
        // Imprimindo os números pares e ímpares distintos agrupados
        System.out.println("Números pares distintos: " + groupedNumbers.get(true));
        System.out.println("Números ímpares distintos: " + groupedNumbers.get(false));
		
//	    07. imprima o maior número da lista, se não houver lance uma java.util.NoSuchElementException
        
        try {
            // Encontrando o maior número na lista
            Integer maxNumber = numbers.stream()
                                    .max(Integer::compareTo)
                                    .get(); // Obtendo o valor máximo, lançando NoSuchElementException se a lista estiver vazia
            
            // Imprimindo o maior número encontrado
            System.out.println("O maior número da lista é: " + maxNumber);
        } catch (NoSuchElementException e) {
            System.out.println("A lista está vazia. Não há maior número.");
        }
        
//	    08. imprima apenas os 3 primeiros números da lista
        
        numbers.stream()
        .limit(3) // Limita o stream aos três primeiros elementos
        .forEach(System.out::println); // Imprime cada número
        
//	    09. imprima a média dos números da lista, se não for possível calcular a média imprima Double.NaN
        
        double average = numbers.stream()
                .mapToDouble(Integer::doubleValue) // Convertendo cada número para double
                .average() // Calculando a média
                .orElse(Double.NaN); // Se não for possível calcular, retorna Double.NaN

        // Imprimindo a média dos números da lista
		System.out.println("A média dos números da lista é: " + average);
        
//	    10. imprima a quantidade de elementos da lista, a soma de seus elementos, a média e o valor máximo
		
		// Quantidade de elementos
        long count = numbers.size();

        // Soma dos elementos
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        // Média dos elementos
        double media = numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(Double.NaN);

        // Valor máximo
        try {
            int max = numbers.stream().mapToInt(Integer::intValue).max().getAsInt();

        // Imprimindo os resultados
            System.out.println("Quantidade de elementos: " + count);
            System.out.println("Soma dos elementos: " + sum);
            System.out.println("Média dos elementos: " + media
            		);
            System.out.println("Valor máximo: " + max);
        } catch (NoSuchElementException e) {
            System.out.println("Não foi possível encontrar o valor máximo. A lista está vazia.");
        }
        
		
//	    11. imprima a data de hoje, somando a quantidade de dias indicadas por cada elemento distinto da lista em ordem crescente

     // Obtendo elementos distintos e ordenando em ordem crescente
        List<Integer> distinctSortedNumbers = numbers.stream()
                .distinct() // Obtém apenas elementos distintos
                .sorted() // Ordena em ordem crescente
                .collect(Collectors.toList()); // Coleta em uma lista
        
        // Obtendo a data de hoje
        LocalDate today = LocalDate.now();
        
        // Imprimindo a data de hoje somando a quantidade de dias indicada por cada elemento distinto da lista em ordem crescente
        System.out.println("Data de hoje com a adição de dias indicados pela lista em ordem crescente:");
        distinctSortedNumbers.forEach(days -> {
            LocalDate futureDate = today.plusDays(days); // Calcula a nova data para cada valor
            System.out.println("Em " + days + " dias: " + futureDate);
        });
	}
	}
