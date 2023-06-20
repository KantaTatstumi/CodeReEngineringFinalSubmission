
public class Character {
	public class WeaponAttribute {
		public String weapon;
		public String weaponType;
	   
		WeaponAttribute(String weapon, String weaponType){
		 this.weapon = weapon;
		 this.weaponType = weaponType;
		}
	}
	   
	public class ArmorAttribute {
		public String armor;
		public String armorType;
	   
		void WeaponAttribute(String armor, String armorType){
		 this.armor = armor;
		 this.armorType = armorType;
		}
	}
	   
	public class Character {
		private String name;
		private String charClass;
	   
	   // --> yang dicomment adalah code smell karena 4 atribut dibawah bisa dijadikan 2 class.
	   // private String weapon;
	   // private String weaponType;
	   // private String armor;
	   // private String armorType;
	   
		private WeaponAttribute WeaponAttr;
		private ArmorAttribute ArmorAttr;
	   
		
		public Character(String name, String charClass, WeaponAttribute WeaponAttr, ArmorAttribute ArmorAttr) {
		 super();
		 this.name = name;
		 this.ArmorAttr = ArmorAttr;
		 this.WeaponAttr = WeaponAttr;
		}
	   
		public String getName() {
		 return name;
		}
	   
		public void setName(String name) {
		 this.name = name;
		}
	   
		public String getCharClass() {
		 return charClass;
		}
	   
		public void setCharClass(String charClass) {
		 this.charClass = charClass;
		}
	   
		public String getWeapon() {
		 return WeaponAttr.weapon;
		}
	   
		public void setWeapon(String weapon) {
		 this.WeaponAttr.weapon = weapon;
		}
	   
		public String getWeaponType() {
		 return WeaponAttr.weaponType;
		}
	   
		public void setWeaponType(String weaponType) {
		 this.WeaponAttr.weaponType = weaponType;
		}
	   
		public String getArmor() {
		 return ArmorAttr.armor;
		}
	   
		public void setArmor(String armor) {
		 this.ArmorAttr.armor = armor;
		}
	   
		public String getArmorType() {
		 return ArmorAttr.armorType;
		}
	   
		public void setArmorType(String armorType) {
		 this.ArmorAttr.armorType = armorType;
		}
		
		
	}
	
	
}
