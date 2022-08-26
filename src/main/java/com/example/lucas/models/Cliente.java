package com.example.lucas.models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
  private static List<Cliente> clientes = new ArrayList<>();

  private String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  private List<Float> number;

  public List<Float> getNumber() {
    return number;
  }

  public void setNumber(List<Float> number) {
    this.number = number;
  }

}
