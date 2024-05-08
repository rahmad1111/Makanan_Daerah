package com.r.makanandaerah.datapusat

import com.r.makanandaerah.R
import com.r.makanandaerah.tatanan.MakananRow
import com.r.makanandaerah.tatanan.MakananColumn
import com.r.makanandaerah.tatanan.MakananGrid


object Datanya {
    val makananLazyRow = listOf(
        MakananRow(
            id = 1,
            gambar = R.drawable.__mi_aceh_row,
            nama_menu = "Mi Aceh",
            asal = "Nanggroe Aceh Darussalam",
            deskripsi = "Mi Aceh adalah masakan mie pedas dengan irisan daging sapi, daging kambing atau makanan laut seperti udang dan cumi. Dalam proses pembuatannya, mi Aceh menggunakan mi yang khas dengan bentuk tebal dan pipih serta berwarna cenderung kuning cerah. Kemudian, disajikan dalam sup kari yang pedas dan gurih."
        ),
        MakananRow(
            id = 2,
            gambar = R.drawable.__bika_ambon_row,
            nama_menu = "Bika Ambon",
            asal = "Sumatera Utara",
            deskripsi = "Walaupun namanya Bika Ambon, namun makanan ini bukan berasal dari Ambon. Kue ini berasal dari Sumatra Utara dan biasanya banyak dijual di Kota Medan sebagai oleh-oleh. Kue berwarna kuning ini memiliki tekstur legit, lembut, manis, tetapi berlubang-lubang."
        ),
        MakananRow(
            id = 3,
            gambar = R.drawable.__rendang_row,
            nama_menu = "Rendang",
            asal = "Sumatera Barat",
            deskripsi = "Rendang adalah salah satu makanan tradisional Minangkabau yang menggunakan daging dan santan kelapa berbumbu rempah dan cabai. Makanan dengan cita rasa pedas ini sangat digemari oleh seluruh kalangan maupun berbagai suku."
        ),
        MakananRow(
            id = 4,
            gambar = R.drawable.__gulai_ikan_patin_row,
            nama_menu = "Gulai Ikan Patin",
            asal = "Jambi",
            deskripsi = "Gulai ikan patin adalah makanan khas daerah Jambi Ini memiliki keunikan dari cara memasaknya. Cara memasaknya dicampur dengan daging buah durian yang sudah difermentasi atau biasa disebut tempoyak. Namun terkadang bisa digantikan dengan santan."
        ),
        MakananRow(
            id = 5,
            gambar = R.drawable.__pendap_row,
            nama_menu = "Pendap",
            asal = "Bengkulu",
            deskripsi = "Makanan khas daerah Bengkulu memiliki citarasa yang pedas. Pendap berbahan dasar ikan yang dibumbui dengan bumbu khusus yang beraneka ragam dan dimasak dengan dibungkus daun talas."
        ),
        MakananRow(
            id = 6,
            gambar = R.drawable.__gulai_belacan_row,
            nama_menu = "Gulai Belacan",
            asal = "Riau",
            deskripsi = "Makanan khas Riau yang terbuat dari olahan daging, udang, atau ikan berkuah santan yang telah dicampur belacan atau terasi."
        ),
        MakananRow(
            id = 7,
            gambar = R.drawable.__otak_otak_row,
            nama_menu = "Otak-Otak",
            asal = "Kepulauan Riau",
            deskripsi = "Otak-otak di Kepri terbuat dari ikan dan cumi yang langsung dicampur dengan saus sambalnya sehingga warnanya menjadi kecoklatan. Setelah dibungkus dengan daun kelapa, otak-otak ini kemudian dipanggang. Hmm...lezat!"
        ),
        MakananRow(
            id = 8,
            gambar = R.drawable.__pempek_row,
            nama_menu = "Pempek",
            asal = "Sumatera Utara",
            deskripsi = "Pempek atau Mpek-mpek merupakan khas daerah Sumatera Selatan yang terkenal sangat enak dan sering dijadikan sebagai oleh-oleh wisatawan yang berkunjung. Makanan ini terbuat dari olahan ikan yang dicampur sagu. Dan tentunya saja dilengkapi dengan kuah cuko atau cuka yang dibuat dari campuran cuka, asam jawa, gula merah dan cabai."
        ),
        MakananRow(
            id = 9,
            gambar = R.drawable.__mi_bangka_row,
            nama_menu = "Mi Bangka",
            asal = "Bangka Belitung",
            deskripsi = "Mi Bangka makanan khas daerah Bangka ini tentu saja berbahan dasar mi. Dihidangkan dengan campuran yang terbuat dari bumbu ikan, udang, dan cumi, dan ditaburi dengan kecambah serta mentimun."
        ),
        MakananRow(
            id = 10,
            gambar = R.drawable._0_seruit_row,
            nama_menu = "Seruit",
            asal = "Lampung",
            deskripsi = "Seruit makanan khas Lampung, berupa ikan goreng atau bakar dibumbui terasi, lalu dicampur dengan tempoyak (olahan fermentasi durian) atau mangga. Hidangan ini dimakan dengan lalapan sayuran."
        ),
    )
    val makananLazyColumn = listOf(
        MakananColumn(
            id = 1,
            gambar = R.drawable.__sate_bandeng_column,
            nama_menu = "Sate Bandeng",
            asal = "Banten",
            deskripsi = "Tidak seperti kebanyakan sate pada umumnya, satai bandeng ini masih berbentuk ikan utuh dan memiliki tekstur lembut persis dengan otak-otak. Dalam proses pembuatannya, sate bandeng diolah dengan memisahkan daging dari durinya, dihancurkan, diberi bumbu, lalu dagingnya dimasukan kembali ke dalam ikan dan dimasak hingga matang."
        ),
        MakananColumn(
            id = 2,
            gambar = R.drawable.__kerak_telor_column,
            nama_menu = "Kerak Telor",
            asal = "DKI Jakarta",
            deskripsi = "Kerak telor adalah makanan khas Betawi, terbuat dari telur ayam atau bebek, ketan dan ebi yang ditaburi bawang goreng, dan kelapa sangrai. Cita rasanya pedas asin dan ada intipnya. Makanan ini masih dapat kita jumpai ketika ada festival, seperti saat Pekan Raya Jakarta."
        ),
        MakananColumn(
            id = 3,
            gambar = R.drawable.__karedok_column,
            nama_menu = "Karedok",
            asal = "Jawa Barat",
            deskripsi = "Karedok merupakan makanan khas Jawa Barat yang paling mendekati kesamaan dengan salad, yaitu sayuran yang digunakan sebagai bahan utama masih mentah. Penyajiannya hanya sayuran mentah yang dipotong, lalu dicampur langsung dengan bumbu kacang."
        ),
        MakananColumn(
            id = 4,
            gambar = R.drawable.__lumpia_column,
            nama_menu = "Lumpia",
            asal = "Jawa Tengah",
            deskripsi = "Lumpia adalah makanan khas Jawa Tengah, tepatnya di Kota Semarang. Lumpia sering sekali dijadikan oleh-oleh ketika berwisata ke kota Semarang. Lumpia itu sendiri memiliki berbagai macam isian, mulai dari ayam, rebung, sayuran, hingga udang."
        ),
        MakananColumn(
            id = 5,
            gambar = R.drawable.__gudeg_column,
            nama_menu = "Gudeg",
            asal = "DI Yogyakarta",
            deskripsi = "Gudeg merupakan olahan yang berbahan dasar nangka muda dan dimasak dengan santan ini mempunyai cita rasa yang khas, yaitu manis. Gudeg biasanya disajikan dengan lauk ayam kampung, telur, tempe atau tahu bacem, dan sambal krecek. Gudeg dan semua lauk-pauknya itu biasanya dimakan dengan seporsi nasi hangat. Lezat!"
        ),
        MakananColumn(
            id = 6,
            gambar = R.drawable.__rujak_cingur_column,
            nama_menu = "Rujak Cingur",
            asal = "Jawa Timur",
            deskripsi = "Rujak cingur ini sama seperti halnya gado-gado yang berisi sayuran, lontong, tempe, dan tahu yang diberi bumbu petis, tetapi yang membuatnya khas adalah adanya cingur atau irisan tulang rawan sapi bagian hidung."
        ),
        MakananColumn(
            id = 7,
            gambar = R.drawable.__ayam_betutu_column,
            nama_menu = "Ayam Betutu",
            asal = "Jawa Timur",
            deskripsi = "Ayam betutu makanan khas Bali yang biasanya sering dijumpai di setiap warung makan ketika kamu berada di Bali. Ayam betutu itu sendiri merupakan olahan ayam dengan bumbu betutu, bumbu khas Bali yang terdiri dari sereh, salam, dan rempah lain. Terkadang ayam betutu dibungkus oleh daun pisang dan dibungkus lagi dengan pelepah pinang kemudian dibakar."
        ),
        MakananColumn(
            id = 8,
            gambar = R.drawable.__ayam_taliwang_column,
            nama_menu = "Ayam Taliwang",
            asal = "Nusa Tengara Timur",
            deskripsi = "Ayam Taliwang adalah makanan khas Lombok, Nusa Tenggara Barat yang berbahan dasar ayam. Daging ayam tersebut dibakar dengan bumbu cabai merah kering, bawang merah, bawang putih, tomat, dan lainnya. Ayam taliwang biasanya disajikan bersama menu tambahan seperti plecing kangkung."
        ),
        MakananColumn(
            id = 9,
            gambar = R.drawable.__catemak_jagung_column,
            nama_menu = "Catemak Jagung",
            asal = "Nusa Tengara Timur",
            deskripsi = "Makanan khas ini berbahan dasar jagung, biasanya disajikan sebagai makanan penutup."
        ),
        MakananColumn(
            id = 10,
            gambar = R.drawable._0_bubur_sambas_column,
            nama_menu = "Bubur Sambas",
            asal = "Kalimantan Barat",
            deskripsi = "Bubur pedas sambas merupakan makanan khas Kalimantan Barat, khususnya Pontianak. Bubur sambas berisi berbagai macam bahan, seperti ikan teri, daun pakis, kacang tanah, kacang panjang, dan lain-lain."
        ),
    )
    val makananLazyGrid = listOf(
        MakananGrid(
            id = 1,
            gambar = R.drawable.__juhu_singkah_grid,
            nama_menu = "Juhu Singkah",
            asal = "Kalimantan Tengah",
            deskripsi = "Juhu singkah adalah makanan khas yang dimiliki suku Dayak, terutama dari Kalimantan Tengah yang terbuat dari umbu rotan. Juhu singkah memiliki rasa gurih, asam, dan kepahit-pahitan yang bercampur dengan rasa manis dari daging ikan."
        ),
        MakananGrid(
            id = 2,
            gambar = R.drawable.__soto_banjar_grid,
            nama_menu = "Soto Banjar",
            asal = "Kalimantan Selatan",
            deskripsi = "Soto banjar adalah soto khas suku Banjar dengan bahan utama ayam dan beraroma rempah-rempah, ditambah dengan perkedel atau rebusan kentang, tebusan telur, dan ketupat"
        ),
        MakananGrid(
            id = 3,
            gambar = R.drawable.__ayam_cincane_grid,
            nama_menu = "Ayam Cincane",
            asal = "Kalimantan Timur",
            deskripsi = "Ayam cincane adalah makanan khas Kalimantan Timur, khususnya daerah Samarinda. Makanan ini berbahan dasar ayam yang diberi bumbu berwarna merah."
        ),
        MakananGrid(
            id = 4,
            gambar = R.drawable.__kepiting_soka_grid,
            nama_menu = "Kepiting Soka",
            asal = "Kalimantan Utara",
            deskripsi = "Keunikan dari masakan kepiting soka adalah semua bagian kepiting dari daging hingga cangkangnya dapat dikonsumsi karena keseluruhan dari kepiting soka ini begitu lunak."
        ),
        MakananGrid(
            id = 5,
            gambar = R.drawable.__sup_konro_grid,
            nama_menu = "Sup Konro",
            asal = "Sulawesi Utara",
            deskripsi = "Sup konro merupakan masakan berkuah tanpa santan khas Bugis yang berwarna coklat kehitaman dan dinikmati dengan potongan ketupat kecil. Warna gelap pada sup ini berasal dari keluak yang berwarna hitam."
        ),
        MakananGrid(
            id = 6,
            gambar = R.drawable.__ikan_jantung_pisang_grid,
            nama_menu = "Ikan Jantung Pisang",
            asal = "Sulawesi Tengah",
            deskripsi = "Ikan jantung pisang adalah makanan khas Sulawesi Tengah, tepatnya di kota Palu. Makanan bercita rasa asam pedas yang segar ini, menggunakan ikan kakap sebagai bahan utama."
        ),
        MakananGrid(
            id = 7,
            gambar = R.drawable.__lapa_lapa_grid,
            nama_menu = "Lapa-Lapa",
            asal = "Sulawesi Tenggara",
            deskripsi = "Lapa-lapa adalah makanan khas sulawesi tenggara yang mempunyai cita rasa gurih, sebagai pelengkap biasanya lapa-lapa ini di santap dengan ikan kaholeonarore (ikan asin). Makanan khas satu ini terbuat dari beras dan memiliki bentuk lonjong seperti lontong. Bedanya, lapa-lapa mempunyai rasa karena direbus dengan santan dan dibungkus dengan daun janur."
        ),
        MakananGrid(
            id = 8,
            gambar = R.drawable.__bolu_paranggi_grid,
            nama_menu = "Bolu Paranggi",
            asal = "Sulawesi Barat",
            deskripsi = "Bolu paranggi ini adalah makanan manis khas Sulawesi Barat yang terbuat dari campuran gula, tepung terigu, telur dan gula aren. Ciri khas dari kue ini memiliki bentuk bundar dan berwarna coklat dengan rasa manis."
        ),
        MakananGrid(
            id = 9,
            gambar = R.drawable.__binte_biluhuta_grid,
            nama_menu = "Binte Biluhuta",
            asal = "Gorontalo",
            deskripsi = "Makanan khas ini biasa dikenal dengan sebutan milu siram. Makanan ini terbuat dari dari jagung yang disiram dengan bumbu khas daerah dan dicampur dengan udang, belimbing sayur, serta topping pelengkap lainnya."
        ),
        MakananGrid(
            id = 10,
            gambar = R.drawable._0_tinutuan_grid,
            nama_menu = "Tinutuan",
            asal = "Sulawesi Utara",
            deskripsi = "Tinutuan atau yang biasa dikenal dengan bubur Manado adalah makanan khas dari Manado, Sulawesi Utara. Namun, ada juga yang mengatakan tinutuan adalah makanan khas Minahasa. Tinutuan merupakan campuran berbagai macam sayuran, seperti kemangi dan bayam juga jagung, tidak mengandung daging, dan biasanya disajikan untuk sarapan pagi beserta pelengkap hidangan lainnya, seperti perkedel ikan tude."
        ),
    )
}


