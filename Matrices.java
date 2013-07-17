import java.io.BufferedReader;
  import java.io.IOException;
import java.io.InputStreamReader;


  public class fundamentos {
		public static void main(String[]args) throws NumberFormatException, IOException{
			BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("1.Suma");
			System.out.println("2.Resta");
			System.out.println("3.Multiplicacion");
			System.out.println("4.Division");
			System.out.println("Eliga una opcion");

			int serie = Integer.parseInt(lectura.readLine());
			switch (serie){
			case 1:
				Suma();
				break;
			case 2:
				Resta();
				break;
			case 3:
				Multiplicacion();
				break;
			case 4:
				Division();
				break;

			default: 
				System.out.println("Eleccion Incorrecta");
		}
	}

			public static void Suma() throws NumberFormatException, IOException {
				BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese limite de la lista");
				int lim = Integer.parseInt(lectura.readLine());
				int matriz1[][] = new int [lim][lim];
				int matriz2[][] = new int [lim][lim];
				int matrizresult[][] = new int [100][100];
				System.out.println("\nPrimera matriz\n");
				for (int a = 0; a < matriz1.length; a++) {
				for (int b = 0; b < matriz1.length; b++) {
				System.out.println("Ingrese los valores");
				int dato = Integer.parseInt(lectura.readLine());
				matriz1[a][b] = dato;
				}
				}
				System.out.println("\nSegunda matriz\n");
				for (int a = 0; a < matriz2.length; a++) {
				for (int b = 0; b < matriz2.length; b++) {
				System.out.println("Ingrese el valor :");
				int dato = Integer.parseInt(lectura.readLine());
				matriz2[a][b] = dato;
				}
				}
				for (int a = 0; a < matriz2.length; a++) {
				for (int b = 0; b < matriz2.length; b++) {
				matrizresult[a][b] = matriz1[a][b] + matriz2[a][b];
				}
				}
				System.out.println("\n El valor de la Matriz de la Suma es: \n");
				for (int a = 0; a < lim; a++) {
				for (int b = 0; b < lim; b++) {
				System.out.print("\t \t" + matrizresult[a][b] + "\t \t");
				}
				System.out.println();
				}
				int diagonal;
				System.out.println("Escoja una opcion:");
				System.out.println("1. Diagonal Principal");
				System.out.println("2. Diagonal Secundaria");
				System.out.println("3. Fila Inicial");
				System.out.println("4. Columna Inicial");
				System.out.println("5. Fila Final");
				System.out.println("6. Columna Final");
				diagonal = Integer.parseInt(lectura.readLine());
				switch (diagonal){

				case 1:
				System.out.println("La Diagonal Principal es:");
				for (int a=0; a< lim; a++){
				for (int b=0; b< lim; b++)
				if(a==b)
				System.out.print("\t \t"+matrizresult[a][b]+"\t \t");
				System.out.println();
				}
				break;
				case 2:

				int cont=1;
				System.out.println("La Diagonal Secundaria es:");
				for (int i=0; i<lim; i++){
				for (int j=0; j<lim ; j++)
				if(j==lim-cont){
				System.out.print("\t \t"+matrizresult[i][j]+"\t \t");
				cont++;
				}
				System.out.println();
				}
				break;
				case 3:
				System.out.println("La Fila Inicial es:");
				for (int i=0; i< lim; i++){
				for (int j=0; j< lim; j++)
				if(i==0){
				System.out.print("\t \t"+matrizresult[i][j]+"\t \t");
				}
				System.out.println();
				}
				break;
				case 4:

				System.out.println("La Columna Inicial es:");
				for (int i=0; i< lim; i++){
				for (int j=0; j< lim; j++)
				if(j==0){
				System.out.print("\t \t"+matrizresult[i][j]+"\t \t");
				}
				System.out.println();
				}
				break;
				case 5:
				System.out.println("La Fila Final es:");
				for (int i=(lim-1); i< lim; i++){
				for (int j=0; j< lim; j++)
				System.out.print("\t \t"+matrizresult[i][j]+"\t \t");
				System.out.println();
				}
				break;
				case 6:
				System.out.println("La Columna Final es:");
				for (int i=0; i< lim; i++){
				for (int j=(lim-1); j< lim; j++)
				System.out.print("\t \t"+matrizresult[i][j]+"\t \t");
				System.out.println();
				}
					break;
				}
			}

				public static void Resta() throws NumberFormatException, IOException {
					BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
					System.out.println("Ingrese limite de la lista");
					int lim = Integer.parseInt(lectura.readLine());
					int matriz1[][] = new int[lim][lim];
					int matriz2[][] = new int[lim][lim];
					int matrizresult[][] = new int[100][100];
					System.out.println("\nPrimera matriz\n");
					for (int a = 0; a < matriz1.length; a++) {
					for (int b = 0; b < matriz1.length; b++) {
					System.out.println("Ingrese los valores");
					int dato = Integer.parseInt(lectura.readLine());
					matriz1[a][b] = dato;
					}
					}
					System.out.println("\nSegunda matriz\n");
					for (int a = 0; a < matriz2.length; a++) {
					for (int b = 0; b < matriz2.length; b++) {
					System.out.println("Ingrese el valor :");
					int dato = Integer.parseInt(lectura.readLine());
					matriz2[a][b] = dato;
					}
					}
					for (int a = 0; a < matriz2.length; a++) {
					for (int b = 0; b < matriz2.length; b++) {
					matrizresult[a][b] = matriz1[a][b] - matriz2[a][b];
					}
					}
					System.out.println("\n El valor de la Matriz de la Resta es: \n");
					for (int a = 0; a < lim; a++) {
					for (int b = 0; b < lim; b++) {
					System.out.print("\t \t" + matrizresult[a][b] + "\t \t");
					}
					System.out.println();
					}
					int diagonal;
					System.out.println("Escoja una opcion:");
					System.out.println("1. Diagonal Principal");
					System.out.println("2. Diagonal Secundaria");
					System.out.println("3. Fila Inicial");
					System.out.println("4. Columna Inicial");
					System.out.println("5. Fila Final");
					System.out.println("6. Columna Final");
					diagonal = Integer.parseInt(lectura.readLine());
					switch (diagonal){

					case 1:
					System.out.println("La Diagonal Principal es:");
					for (int a=0; a< lim; a++){
					for (int b=0; b< lim; b++)
					if(a==b)
					System.out.print("\t \t"+matrizresult[a][b]+"\t \t");
					System.out.println();
					}

					case 2:

					int cont=1;
					System.out.println("La Diagonal Secundaria es:");
					for (int i=0; i<lim; i++){
					for (int j=0; j<lim ; j++)
					if(j==lim-cont){
					System.out.print("\t \t"+matrizresult[i][j]+"\t \t");
					cont++;
					}
					System.out.println();
					}
					break;
					case 3:
					System.out.println("La Fila Inicial es:");
					for (int i=0; i< lim; i++){
					for (int j=0; j< lim; j++)
					if(i==0){
					System.out.print("\t \t"+matrizresult[i][j]+"\t \t");
					}
					System.out.println();
					}
					break;
					case 4:

					System.out.println("La Columna Inicial es:");
					for (int i=0; i< lim; i++){
					for (int j=0; j< lim; j++)
					if(j==0){
					System.out.print("\t \t"+matrizresult[i][j]+"\t \t");
					}
					System.out.println();
					}
					break;
					case 5:
					System.out.println("La Fila Final es:");
					for (int i=(lim-1); i< lim; i++){
					for (int j=0; j< lim; j++)
					System.out.print("\t \t"+matrizresult[i][j]+"\t \t");
					System.out.println();
					}
					break;
					case 6:
					System.out.println("La Columna Final es:");
					for (int i=0; i< lim; i++){
					for (int j=(lim-1); j< lim; j++)
					System.out.print("\t \t"+matrizresult[i][j]+"\t \t");
					System.out.println();
					}
						break;
					}
				}
				public static void Multiplicacion() throws NumberFormatException, IOException {
					BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
					System.out.println("Ingrese limite de la lista");
					int lim = Integer.parseInt(lectura.readLine());
					int matriz1[][] = new int[lim][lim];
					int matriz2[][] = new int[lim][lim];
					int matrizresult[][] = new int[100][100];
					System.out.println("\nPrimera matriz\n");
					for (int a = 0; a < matriz1.length; a++) {
					for (int b = 0; b < matriz1.length; b++) {
					System.out.println("Ingrese los valores");
					int dato = Integer.parseInt(lectura.readLine());
					matriz1[a][b] = dato;
					}
					}
					System.out.println("\nSegunda matriz\n");
					for (int a = 0; a < matriz2.length; a++) {
					for (int b = 0; b < matriz2.length; b++) {
					System.out.println("Ingrese el valor :");
					int dato = Integer.parseInt(lectura.readLine());
					matriz2[a][b] = dato;
					}
					}
					for (int a = 0; a < matriz2.length; a++) {
					for (int b = 0; b < matriz2.length; b++) {
					matrizresult[a][b] = matriz1[a][b] * matriz2[a][b];
					}
					}
					System.out.println("\n El valor de la Matriz de la Multiplicacion es: \n");
					for (int a = 0; a < lim; a++) {
					for (int b = 0; b < lim; b++) {
					System.out.print("\t \t" + matrizresult[a][b] + "\t \t");
					}
					System.out.println();
					}
					int diagonal;
					System.out.println("Escoja una opcion:");
					System.out.println("1. Diagonal Principal");
					System.out.println("2. Diagonal Secundaria");
					System.out.println("3. Fila Inicial");
					System.out.println("4. Columna Inicial");
					System.out.println("5. Fila Final");
					System.out.println("6. Columna Final");
					diagonal = Integer.parseInt(lectura.readLine());
					switch (diagonal){

					case 1:
					System.out.println("La Diagonal Principal es:");
					for (int i=0; i< lim; i++){
					for (int j=0; j< lim; j++)
					if(i==j)
					System.out.print("\t \t"+matrizresult[i][j]+"\t \t");
					System.out.println();
					}
					break;
					case 2:

					int cont=1;
					System.out.println("La Diagonal Secundaria es:");
					for (int i=0; i<lim; i++){
					for (int j=0; j<lim ; j++)
					if(j==lim-cont){
					System.out.print("\t \t"+matrizresult[i][j]+"\t \t");
					cont++;
					}
					System.out.println();
					}
					break;
					case 3:
					System.out.println("La Fila Inicial es:");
					for (int i=0; i< lim; i++){
					for (int j=0; j< lim; j++)
					if(i==0){
					System.out.print("\t \t"+matrizresult[i][j]+"\t \t");
					}
					System.out.println();
					}
					break;
					case 4:

					System.out.println("La Columna Inicial es:");
					for (int i=0; i< lim; i++){
					for (int j=0; j< lim; j++)
					if(j==0){
					System.out.print("\t \t"+matrizresult[i][j]+"\t \t");
					}
					System.out.println();
					}
					break;
					case 5:
					System.out.println("La Fila Final es:");
					for (int i=(lim-1); i< lim; i++){
					for (int j=0; j< lim; j++)
					System.out.print("\t \t"+matrizresult[i][j]+"\t \t");
					System.out.println();
					}
					break;
					case 6:
					System.out.println("La Columna Final es:");
					for (int i=0; i< lim; i++){
					for (int j=(lim-1); j< lim; j++)
					System.out.print("\t \t"+matrizresult[i][j]+"\t \t");
					System.out.println();
					}
						break;
					}
				}
				public static void Division() throws NumberFormatException, IOException {
					BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
					System.out.println("Ingrese limite de la lista");
					int lim = Integer.parseInt(lectura.readLine());
					int matriz1[][] = new int[lim][lim];
					int matriz2[][] = new int[lim][lim];
					int matrizresult[][] = new int[100][100];
					System.out.println("\nPrimera matriz\n");
					for (int a = 0; a < matriz1.length; a++) {
					for (int b = 0; b < matriz1.length; b++) {
					System.out.println("Ingrese los valores");
					int dato = Integer.parseInt(lectura.readLine());
					matriz1[a][b] = dato;
					}
					}
					System.out.println("\nSegunda matriz\n");
					for (int a = 0; a < matriz2.length; a++) {
					for (int b = 0; b < matriz2.length; b++) {
					System.out.println("Ingrese el valor :");
					int dato = Integer.parseInt(lectura.readLine());
					matriz2[a][b] = dato;
					}
					}
					for (int a = 0; a < matriz2.length; a++) {
					for (int b = 0; b < matriz2.length; b++) {
					matrizresult[a][b] = matriz1[a][b] / matriz2[a][b];
					}
					}
					System.out.println("\n El valor de la Matriz de la division es: \n");
					for (int a = 0; a < lim; a++) {
					for (int b = 0; b < lim; b++) {
					System.out.print("\t \t" + matrizresult[a][b] + "\t \t");
					}
					System.out.println();
					}
					int diagonal;
					System.out.println("Escoja una opcion:");
					System.out.println("1. Diagonal Principal");
					System.out.println("2. Diagonal Secundaria");
					System.out.println("3. Fila Inicial");
					System.out.println("4. Columna Inicial");
					System.out.println("5. Fila Final");
					System.out.println("6. Columna Final");
					diagonal = Integer.parseInt(lectura.readLine());
					switch (diagonal){

					case 1:
					System.out.println("La Diagonal Principal es:");
					for (int i=0; i< lim; i++){
					for (int j=0; j< lim; j++)
					if(i==j)
					System.out.print("\t \t"+matrizresult[i][j]+"\t \t");
					System.out.println();
					}
					break;
					case 2:

					int cont=1;
					System.out.println("La Diagonal Secundaria es:");
					for (int i=0; i<lim; i++){
					for (int j=0; j<lim ; j++)
					if(j==lim-cont){
					System.out.print("\t \t"+matrizresult[i][j]+"\t \t");
					cont++;
					}
					System.out.println();
					}
					break;
					case 3:
					System.out.println("La Fila Inicial es:");
					for (int i=0; i< lim; i++){
					for (int j=0; j< lim; j++)
					if(i==0){
					System.out.print("\t \t"+matrizresult[i][j]+"\t \t");
					}
					System.out.println();
					}
					break;
					case 4:

					System.out.println("La Columna Inicial es:");
					for (int i=0; i< lim; i++){
					for (int j=0; j< lim; j++)
					if(j==0){
					System.out.print("\t \t"+matrizresult[i][j]+"\t \t");
					}
					System.out.println();
					}
					break;
					case 5:
					System.out.println("La Fila Final es:");
					for (int i=(lim-1); i< lim; i++){
					for (int j=0; j< lim; j++)
					System.out.print("\t \t"+matrizresult[i][j]+"\t \t");
					System.out.println();
					}
					break;
					case 6:
					System.out.println("La Columna Final es:");
					for (int i=0; i< lim; i++){
					for (int j=(lim-1); j< lim; j++)
					System.out.print("\t \t"+matrizresult[i][j]+"\t \t");
					System.out.println();
					}
						break;
					}
					}
	}
