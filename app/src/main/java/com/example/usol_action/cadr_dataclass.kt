package com.example.usol_action

data class cadr_dataclass(val cadrimg:Int)
class cadr_list{val list = arrayListOf(
    cadr_dataclass(R.drawable.cadr1),
    cadr_dataclass(R.drawable.cadr2),
    cadr_dataclass(R.drawable.cadr3),
    cadr_dataclass(R.drawable.cadr4),
    cadr_dataclass(R.drawable.cadr5),
)
}
