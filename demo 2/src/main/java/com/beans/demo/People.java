package com.beans.demo;

import java.util.List;
import java.util.Objects;

public abstract class People<PersonType extends Person> implements Iterable <PersonType>   {

   private List<PersonType> personList;
    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public void add(PersonType personType){
        this.personList.add(personType);
    }

    public void remove(PersonType personType){
        this.personList.remove(personType);
    }
    public Integer size(){
        return this.personList.size();
    }

    public void clear(){
        this.personList.clear();
    }

    public void addAll(Iterable<PersonType> personType){
        for (PersonType person: personType){
            this.personList.add(person);
        }
    }

    public PersonType findById(Long id){
        for (PersonType person: personList){
            if (Objects.equals(person.getId(), id)){
                return person;
            }
        }
        return null;
    }

    public List<PersonType> findAll(){
        return this.personList;
    }

}
