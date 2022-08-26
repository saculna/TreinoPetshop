package com.example.lucas.models;

import java.util.ArrayList;
import java.util.List;



public class OrdemServico {
  private static List<OrdemServico> ordermServico = new ArrayList<>();
  private int id_cliente;
  public int getId_cliente() {
    return id_cliente;
  }
  public void setId_cliente(int id_cliente) {
    this.id_cliente = id_cliente;
  }
  private float valor;
  public float getValor() {
    return valor;
  }
  public void setValor(float valor) {
    this.valor = valor;
  }
  private float hora_entrada;
  public float getHora_entrada() {
    return hora_entrada;
  }
  public void setHora_entrada(float hora_entrada) {
    this.hora_entrada = hora_entrada;
  }
  private float hora_saida;
  public float getHora_saida() {
    return hora_saida;
  }
  public void setHora_saida(float hora_saida) {
    this.hora_saida = hora_saida;
  }
}
