package homework;
interface Assaultable {
	void attack();
}//第一题
interface Mobile {
	void move();
}
//第二题
abstract class Weapon implements Mobile,Assaultable{

	public void attack() {
        
	}

	public void move() {
		
	}
}//第三题
class Tank extends Weapon{
	public void attack(){};
	public void move(){};
}
class Flighter extends Weapon{
	public void attack(){};
	public void move(){};
}
class WarShip extends Weapon{
	public void attack(){};
	public void move(){};
}//第四题
class Army{
	private Weapon[] w;
	void way(){
		int max=0;		
	}
	public Army(int i){
		w=new Weapon[i];		
	}
	void addWeapon(int wa){
		w=new Weapon[wa];
	}
	void attackAll(){
		//让数组中所有武器攻击
	}
	void moveAll(){
		//让数组中所有武器移动
	}
}