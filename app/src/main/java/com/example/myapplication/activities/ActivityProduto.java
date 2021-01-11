package com.example.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;
import com.example.myapplication.model.Produto;

public class ActivityProduto extends AppCompatActivity {

    private EditText editNomeProduto;
    private EditText editQuantidadeProduto;
    private EditText editPrecoProduto;

    private Button btnSalvarProduto;

    private Produto produto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        editNomeProduto = (EditText) findViewById(R.id.editNomeProduto);
        editPrecoProduto = (EditText) findViewById(R.id.editPrecoProduto);
        editQuantidadeProduto = (EditText) findViewById(R.id.editQuantidadeProduto);

        btnSalvarProduto = (Button) findViewById(R.id.btnSalvarProduto);
    }

    private Produto getDadosProdutoDoFormulario(){
        this.produto = new Produto();

        if(this.editNomeProduto.getText().toString().isEmpty() == false){
            this.produto.setNome(this.editNomeProduto.getText().toString());
        }else{
            return null;
        }
        if(this.editQuantidadeProduto.getText().toString().isEmpty() == false){
            int quantidade = Integer.parseInt(this.editQuantidadeProduto.getText().toString());
            this.produto.setQuantidadeEmEstoque(quantidade);
        }else{
            return null;
        }
        if(this.editPrecoProduto.toString().isEmpty() == false){
            double preco = Double.parseDouble(this.editPrecoProduto.getText().toString());
            this.produto.setPreco(preco);
        }else{
            return null;
        }

        return this.produto;

    }
}