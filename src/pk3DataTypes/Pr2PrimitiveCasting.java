package pk3DataTypes;

public class Pr2PrimitiveCasting {

	public static void main(String[] args) {
		//Whole Numbers
				byte by = 10;
				short sh = 300;
				int in = 10000;
				long lo = 34567654345677654L;
				
				//Decimal Values
				float fl = 45.45f;
				double dol = 56.4543d;
				
				//Character values
				char ch = 'c';
				
				//boolean values
				boolean bo = false;
				
//				//implicit casting
//				sh = by;
//				System.out.println(sh);
//				
//				lo = in;
//				System.out.println(lo);
//				
//				fl = lo;
//				System.out.println(fl);
				
				//Explicit casting
				by = (byte)sh;
				System.out.println(by);
				
				in = (int)lo;
				System.out.println(in);
				
				fl = (float)dol;
				System.out.println(fl);
	}

}
