package br.com.luanadev.esportesapplication.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import br.com.luanadev.esportesapplication.database.converter.ConversorBigDecimal
import br.com.luanadev.esportesapplication.database.dao.PagamentoDAO
import br.com.luanadev.esportesapplication.database.dao.ProdutoDAO
import br.com.luanadev.esportesapplication.model.Pagamento
import br.com.luanadev.esportesapplication.model.Produto

@Database(
    version = 1,
    entities = [Produto::class, Pagamento::class],
    exportSchema = false
)
@TypeConverters(ConversorBigDecimal::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun produtoDao(): ProdutoDAO
    abstract fun pagamentoDao(): PagamentoDAO
}