<template>
  <div class="hello">
    <h3>watch</h3>
    <button v-on:click="handleEvent">v-on:click</button><br>
    <button @click="handleEvent">@click:clickBtn</button><br>
    <button v-on:click="handleEvent2" data-my='100' data-my2='{"a":200, "b":300}'>clickBtn2</button><br>

    <button @[aaa]="handleEvent">@[aaa]</button><br>
    <button v-on:[bbb]="handleEvent">@mouseover</button><br>
    <button @[ccc]="handleEvent">@[mouseleave]</button><br>
<!--    <button v-on:[aaa]="handleEvent2" data-my='홍길동' data-my2='{"name":"홍길동", "age":"20"}'>click</button><br>-->
    <button v-on:[aaa]="handleEvent2" data-my="홍길동" data-my2='{"name":"홍길동","age":20}'>click</button>

  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  data:function(){
    return{
      aaa:'click',   //data속성을 이벤트이름으로 사용함
      bbb:'mouseover',
      ccc:'mouseleave'
    }
  },
  //이벤트 핸들러 등록
  methods: {
    handleEvent:function (e){
      console.log(`handleEvent 호출, 이벤트 타입 : ${e.type}`)
    },
    handleEvent2:function (e) {
      console.log(`clickBtn2 호출, 사용자 정의 데이터 : ${e.target.dataset.my}`);
      console.log(`clickBtn2 호출, 사용자 정의 데이터 : ${e.target.dataset.my2}`);
      let x = JSON.parse(e.target.dataset.my2);
      console.log("문자열 -> json : ")
      console.log(x);
    }
  }

}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
