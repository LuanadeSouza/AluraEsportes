package br.com.luanadev.esportesapplication.ui.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import br.com.luanadev.esportesapplication.R
import br.com.luanadev.esportesapplication.ui.fragment.DetalhesProdutoFragment
import br.com.luanadev.esportesapplication.ui.fragment.ListaProdutosFragment
import br.com.luanadev.esportesapplication.ui.fragment.PagamentoFragment
import org.koin.android.ext.android.inject


class ProdutosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.produtos_activity)
    }
}
