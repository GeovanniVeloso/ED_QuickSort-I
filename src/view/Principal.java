package view;

import controller.QuickSort;
import controller.MergeSort;
import javax.swing.JOptionPane;
import controller.BubbleSort;

public class Principal {
	public static void main(String[] args) {
		
		QuickSort qs = new QuickSort();
		BubbleSort bs = new BubbleSort();
		MergeSort ms = new MergeSort();
		
		int[]quest1 = {74,20,74,87,81, 16,25,99,44,58};
		int[]quest2 = {44,43,42,41,40,39,38};
		int[]quest3 = {31,32,33,34,99,98,97,96};
		int[]quest6 = new int [1500];
		
		int c = 0;
		do {
			
			c = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para as questões 1, 2 e 3, 2 para a questão 6 e 9 para sair"));
			switch(c){
			case 1:
				qs.quickSort(quest1, 0, 9);
				for(int i=0; i<10; i++) {
					System.out.println(quest1[i]);
				}
				System.out.println("=========");
        
				qs.quickSort(quest2, 0, 6);
				for(int i=0; i<7; i++) {
					System.out.println(quest2[i]);
				}
				System.out.println("=========");
        
				qs.quickSort(quest3, 0, 7);
				for(int i=0; i<8; i++) {
					System.out.println(quest3[i]);
				}
				System.out.println("=========");
				break;
				
			case 2:
				
				for(int i = 0; i<1500; i++) {
					quest6[i] = (int)((Math.random()*1500)+1);
				}
				double TIb = System.nanoTime();
				bs.bubblesort(quest6);
				double TFb = System.nanoTime();
				
				double TTb = (TFb - TIb)/(Math.pow(10,9));
				
				System.out.println("O tempo de ordenação do vetor em BubbleSort é: "+TTb);
				
				double TIm = System.nanoTime();
				ms.mergesort(quest6, 0, 1499);
				double TFm = System.nanoTime();
				
				double TTm = (TFm - TIm)/(Math.pow(10,9));
				
				System.out.println("O tempo de ordenação do vetor em MergeSort é: "+TTm);
				
				double TIq = System.nanoTime();
				qs.quickSort(quest6, 0, 1499);
				double TFq = System.nanoTime();
				
				double TTq = (TFq - TIq)/(Math.pow(10,9));
				
				System.out.println("O tempo de ordenação do vetor em QuickSort é: "+TTq);
				
		}
        }while (c!=9);	
	}

}
