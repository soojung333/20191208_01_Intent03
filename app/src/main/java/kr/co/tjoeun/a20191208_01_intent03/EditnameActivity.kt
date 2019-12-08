package kr.co.tjoeun.a20191208_01_intent03

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_editname.*

class EditnameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editname)


//        취소버튼을 누르면? 단순히 화면을 닫기만.

        cancelBtn.setOnClickListener {
           finish()  //현재 액티비티를 종료시킴.
        }


//        확인 버튼을 누르면? 입력된 값을 받아서 MainActivity로 돌려줘야함.

        okBtn.setOnClickListener {
            val inputName = nameEdt.text.toString()

//            결과를 담아주기 위한 용도의 인텐트 생성. 출발지 / 목적지 없다.
            val resultIntent = Intent()
            resultIntent.putExtra("name", inputName)

//            확인버튼을 눌렀다는 것을 명시. + 결과도 첨부
            setResult(Activity.RESULT_OK, resultIntent)

//            세팅이 끝났으니 화면 종료.
            finish()

        }

    }
}
