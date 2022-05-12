package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E>{
    List<E> personList;
    public People() {
        personList = new ArrayList<E>();
    }

    public void add(E person){
        personList.add(person);
    }
    public E findById(Long id){
        for (E i: personList) {
            Long actualId = i.getId();
            if (actualId.equals(id)){
                return i;
            }
        }return null;

    }
    public boolean contains(E person){
        return personList.contains(person);
    }
    public void remove(E person){
        personList.remove(person);
    }
    public void removeId(Long id){
        for (Person i: personList){
            if (i.getId() == id){
                remove((E) i);
            }
        }
    }
    public void removeAll(){
        personList.clear();
    }
    public int count(){
        return personList.size();
    }
    public E[] toArray(){
        return (E[]) personList.toArray();
    }

    public List<E> getPersonList() {
        return personList;
    }

    public void setPersonList(List<E> personList) {
        this.personList = personList;
    }

    @Override
    public Iterator<E> iterator() {
        return personList.iterator();
    }
}
