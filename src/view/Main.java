package view;
import model.Lista;

public class Main {
	public static void main(String[] args) throws Exception{
		
		Lista l = new Lista();
		int[] inicio = {1,2,6,7,8};
		int[] vetor = {3,3,6,9,8,9,5,7,10,4,8,10,8};
		
		l.vectorInit(inicio, l);
		int tamanho = l.size();
		for(int i = 0; i < vetor.length; i++) {
			
			for(int j = 0; j < tamanho; j++) {
				if(l.get(j) == vetor[i]) {
					l.addLast(vetor[i]);
				}
			}
			
			if(vetor[i]%2==0) {
				l.add(vetor[i], 2);
			}else {
				l.add(vetor[i], 1);
			}
		}
		
		l.printList(l);
	}
}
