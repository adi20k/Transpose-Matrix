
public class MatrixTranspose {
	public static void main(String[] args) {
		int original[][]={{1,7,4},{9,4,2},{2,4,3}};    
		System.out.println("Printing Matrix without transpose:");
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				System.out.print(original[i][j]+" ");    
			}    
			System.out.println(); 
		}    
		System.out.println("Printing Matrix After Transpose:");  
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
					System.out.print(original[j][i]+" ");    
				}    
			System.out.println();
		} 
	}
	  
}
