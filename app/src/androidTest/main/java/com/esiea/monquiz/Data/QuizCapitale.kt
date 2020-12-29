package com.esiea.monquiz.Data

class QuizCapitale(val question:String,r1:String,r2:String,r3:String,val correctanswerNbr:Int) {
    fun isCorrect(answerNbr:Int): Boolean{

        if(answerNbr==correctanswerNbr){
            return true
        }else return false
    }
}