package br.com.luanadev.esportesapplication.database.dao

import androidx.room.Dao
import androidx.room.Insert
import br.com.luanadev.esportesapplication.model.Pagamento

@Dao
interface PagamentoDAO {

    @Insert
    fun salva(pagamento: Pagamento) : Long

}