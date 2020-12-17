<template>
  <div class="hello">
    값1: <input type="text" v-model="num1"><br>
    값2: <input type="text" v-model="num2"><br>
    <button @click="cal">+</button>
    <button @click="cal">-</button>
    <button @click="cal">*</button>
    <button @click="cal">/</button><br>
    <span>결과 값 : {{total}}</span>
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
      num1:'',   //data속성을 이벤트이름으로 사용함
      num2:'',
      total:'',
    }
  },
  //이벤트 핸들러 등록
  methods: {
    cal:function(e) {
      let oper = e.target.innerText;
      if(oper === '+'){
        this.total = parseInt(this.num1) + parseInt(this.num2);
      } else if(oper === '-') {
        this.total = parseInt(this.num1) - parseInt(this.num2);
      } else if(oper === '*') {
        this.total = parseInt(this.num1) * parseInt(this.num2);
      } else {
        this.total = parseInt(this.num1) / parseInt(this.num2);
      }
    }

  }

}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
