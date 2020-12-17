<template>
  <div class="hello">
    <h3>watch</h3>
    <button v-on:click="clickBtn">v-on:click</button><br>
    <button @click="clickBtn">@click:clickBtn</button><br>
    <button v-on:click="clickBtn2" data-my='100' data-my2='{"a":200, "b":300}'>clickBtn2</button><br>
    <button @click="xxx('홍길동')">@click="xxx('홍길동')</button><br>
    <button v-on:click="xxx2('홍길동',$event)">click="xxx2('홍길동',$event)"</button>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  data: function(){
    return {
    }
  },
  //이벤트 핸들러 등록
  methods: {
    clickBtn:(e) => {
      console.log(`clickBtn 호출, 이벤트 타입 : ${e.type}`)
    },
    clickBtn2:function(e) {
      console.log(`clickBtn2 호출, 사용자 정의 데이터 : ${e.target.dataset.my}`);
      let x = JSON.parse(`문자열 -> json : ${e.target.dataset.my2}`);
      console.log(`${x.a} \t ${x.b}`);
    },
    xxx:function (e){
      console.log(`xxx 호출, ${e}`);
    },
    xxx2:function (data, event) {
      console.log(`xxx2 호출, ${data}\t${event.type}`)
    }
  }

}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
