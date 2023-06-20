/*

 Inapropriate intimacy pada code ini ditemukan pada access modifiernya dimana pada variabel class Customer, variabelnya dibuat public.
 Hal tersebut membuat class BankAccount dapat mengakses hal yang tidak seharusnya yang pada akhirnya mengakibatkan inapropriate intimacy.
 Oleh karena itu, penyelesaiannya dilakukan dengan mengubah access modifier variabelnya menjadi private dan dibuatkan getter dan setternya.
 
*/


public class Customer {
        private String name;
        private String address;
    
        public Customer(String name, String address) {
            this.name = name;
            this.address = address;
        }
        
        public String getName() {
        	return name;
        }
        
        public String getAddress() {
        	return address;
        }
        
        public void setName(String name) {
        	this.name = name;
        }
        
        public void getAddress(String address) {
        	this.address = address;
        }
        
    
}
