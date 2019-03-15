import java.util.Scanner;
import java.text.*;
import java.math.*;

public class Main {
	
	public static void Cp(double R, double iga, double igb, double igc, double igd, double ige, double igf, double T)
	{
		//Calculate Cp
		Cp = R *(iga + igb*T + igc*T*T + igd*T*T*T + ige*T*T*T*T + igf*T*T*T*T*T);
		//Display result
		System.out.println(Cp)
		System.out.println(R)
	}
	
	
	
	public static void iGas(String Gas, double t)
	{
		double MW = 0, iga, igb, igc, igd, ige, igf, kh, kso, kpr, kvr;
		if(Gas == "O2")
		{
			//Assign
			MW = 32;
			iga = 3.653;
			igb = -0.001337;
			igc = 0.000003294;
			igd = -0.000000001913;
			ige = 0.00000000000002763;
			igf = 0;
			kh = -4.48453;
			kso = -4.200224;
			kpr = 271.5932738;
			kvr = 10;
		}
		else if(Gas == "Ammonia")
		{
			//Assign
		}
		else if(Gas == "CO2")
		{
			//Assign
		}
		else
		{
			System.out.println("Wrong gas inputted");
			return;
		}
		
		double R = 8.314 / MW;
		Cp(R, iga, igb, igc, igd, ige, igf, t);
		h(R, iga, igb, igc, igd, ige, igf, t);
		u(R, iga, igb, igc, igd, ige, igf, t);
		Pr(R, iga, igb, igc, igd, ige, igf, t);
		Vr(R, iga, igb, igc, igd, ige, igf, t);
		
	}
	
	public static void main(String[] args) {
		
	}

}
