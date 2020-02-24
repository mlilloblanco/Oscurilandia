package cl.awakelab.camaraSecreta;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import cl.awakelab.pks.*;
import cl.awakelab.firstLine.*;
public class Tablero {
    //constante
    public final static int CAPACIDAD_POR_DEFECTO = 18;
    public final static int CANTIDAD_KROMIS = 3;
    public final static int CANTIDAD_CAGUANOS = 5;
    public final static int CANTIDAD_TRUPALLAS = 10;
    
    //atributos
    private ArrayList<Carro> carros;
    private ArrayList<Huevo> lanzamientos;
    private String [][] tablero = new String[15][15];
    
    //constructores
    public Tablero() {
        
    }
    public Tablero(List Carro, List huevo) {
        this.carros = new ArrayList<Carro>();
        this.lanzamientos = new ArrayList<Huevo>();
        
        		}
    
    //Getters and Setters
    public ArrayList<Carro> getCarros() {
        return carros;
    }
    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }
    public ArrayList<Huevo> getLanzamientos() {
        return lanzamientos;
    }
    public void setLanzamientos(ArrayList<Huevo> lanzamientos) {
        this.lanzamientos = lanzamientos;
    }
    public String[][] getTablero() {
		return tablero;
	}
	public void setTablero(String[][] tablero) {
		this.tablero = tablero;
	}
	
	//toString
	@Override
	public String toString() {
		return "Tablero [carros=" + carros + ", lanzamientos=" + lanzamientos + ", tablero=" + Arrays.toString(tablero)
				+ "]";
	}
    
    //Metodos
    public void crearCarro() {
    	for (int i = 0; i < CANTIDAD_KROMIS; i++) {
			crearKromi();
		}
    	for (int i = 0; i < CANTIDAD_CAGUANOS; i++) {
			crearCaguano();
		}
    	
    }
    public void crearKromi() {
    	Carro c1;
    	int fila; 
    	int columna;
    	int flag ;
    	do {
    		c1 = new Kromi(); 
    		fila = c1.getUbicacionFila();
        	columna = c1.getUbicacionColumna();
    		flag = 0;	
    	if (fila > 12) {
    		flag = 1;
		} else {
			for (int i = fila; i < fila + 2; i++) {
				if (tablero [fila][columna].) {
					
					flag++;
					System.out.println(flag);
				} 
			}
			
		}
    	} while (flag > 0);	
    	
			tablero[fila][columna] = "K"; 
			tablero[fila+1][columna] = "K"; 
			tablero[fila+2][columna] = "K"; 
    }
    public void crearCaguano() {
    	Carro c1;
    	int fila; 
    	int columna;
    	int flag ;
    	do {
    		c1 = new Caguano(); 
    		fila = c1.getUbicacionFila();
        	columna = c1.getUbicacionColumna();
    		flag = 0;	
    	if (columna > 13) {
    		flag = 1;
		} else {
			for (int i = columna; i < columna + 1; i++) {
				System.out.println("p");
				if (tablero [fila][columna] != null) {
					flag++;
					System.out.println(flag);
				} 
			}
			
		}
    	} while (flag > 0);	
    	
			tablero[fila][columna] = "C"; 
			tablero[fila][columna+1] = "C"; 
		
    }
    
    
    
    public void mostrarMatriz() {
    	for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				if (tablero[i][j] == null) {
					System.out.print("[ ]");
				} else {
					System.out.print("[" + tablero[i][j] + "]");
				}
				}
			
			System.out.println("");
		}
    }
	
    
}