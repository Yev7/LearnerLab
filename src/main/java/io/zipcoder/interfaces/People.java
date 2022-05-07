package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable{
    public People(List<Person> personList) {
        this.personList = personList;
    }

    List<Person> personList = new ArrayList<>();

    public void add(Person person){
        personList.add(person);
    }
    public Person findById(Long id){
        for (Person i: personList) {
            Long actualId = i.getId();
            if (actualId.equals(id)){
                return i;
            }
        }return null;

    }
    public boolean contains(Person person){
        return personList.contains(person);
    }
    public void remove(Person person){
        personList.remove(person);
    }
    public void removeId(Long id){
        for (Person i: personList){
            if (i.getId() == id){
                remove((Person) i);
            }
        }
    }
    public void removeAll(){
        personList.clear();
    }
    public int count(){
        return personList.size();
    }
    public Person[] toArray(){
        return (Person[]) personList.toArray(new Person[0]);
    }

    @Override
    public Iterator iterator() {
        return personList.iterator();
    }
}
