package ua.itea.less9;

public class Cat {

		String name;
		
		Cat(String name){
			this.name=name;
		}
		
		void getInfo(){
			System.out.println("Name: "+name);
		}
		
		public static void main(String[] args) {
			/*Cat cat = new Cat(){
				void getInfo(){
					System.out.println("Name: "+name);
				}
			};*/
		}
}
