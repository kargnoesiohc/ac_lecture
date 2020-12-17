<template>
  <div class="hello">
    가격: <input type="text" v-model="price"><br>
    수랑: <select @change="cal" v-model="quantity">
      <option>10</option>
      <option>20</option>
      <option>30</option>
    </select><br>
    <span>총 가격 : {{total}}</span>
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
      price:'',   //data속성을 이벤트이름으로 사용함
      quantity:'',
      total:'',
    }
  },
  //이벤트 핸들러 등록
  methods: {
    cal:function() {
        this.total = parseInt(this.price) * parseInt(this.quantity);
    },
  },
}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
