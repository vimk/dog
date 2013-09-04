/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

/**
 *
 * @author Kim Vammen
 */
public class Dog
{
    public String name;
    public int age;
    public int addAge;
           
    
        public Dog (String name)
            {
                this.name = name;
            }

                public void setName(String dogName)
                {
                    this.name = dogName;
                }

                public void setAge (int dogAge)
                {
                    this.age = dogAge;
                }

                    public void getName (String dogName)
                    {
                        this.name = dogName;
                    }

                    public void getAge (int dogAge)
                    {
                        this.age = dogAge;                                          
                    }
                    
                        public void addAge (int addYears)
                        {
                               addAge = addYears + age;                        
                        }
                        
                            public String toString()
                            {
                                return (name + " er "+ age + " år.");
                            }

                            
                        
         
}
