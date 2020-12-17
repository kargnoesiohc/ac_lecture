<template>
  <div class="hello">
    <h3>1. 기본 이벤트 처리 방지</h3>
    <a href="https://www.naver.com" @click="x">네이버 - preventDefault</a><br>
    <a href="https://www.google.com" target="_blank">구글</a><br>

    <h3>2. preventDefault 이벤트 수식어 .prevent</h3>
    <a href="https://www.google.com" v-on:click="y">구글1</a><br>
    <a href="https://www.google.com" v-on:click="y2">구글2</a><br>
    <a href="https://www.google.com" v-on:click.prevent="y2">구글_prevent</a><br>

    <h3>3. stop 이벤트 수식어</h3>
    <div style="background-color: yellow" v-on:click="aaa">
      aaa
      <div style="background-color: green" @click.stop="bbb">bbb</div>
    </div>

    <h3>4. enter 이벤트 수식어</h3>
    <input type="text" v-on:keyup="xyz"/> keyup<br>
    <input type="text" v-on:keyup.enter="xyz"/> keyup<br>

    <h3>5. ctrl</h3>
    <input type="text" v-on:keyup.ctrl.enter="xyz">ctrl.enter<br>
    <input type="text" v-on:keyup.ctrl.up="xyz">ctrl.up<br>
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

    }
  },
  //이벤트 핸들러 등록
  methods: {
    x: function() {
      console.log("x");
    },
    y: function() {
      console.log("y");
    },
    y2: function() {
      console.log("y2");
    },
    aaa: function() {
      console.log("aaa");
    },
    bbb: function() {
      console.log("bbb");
    },
    xyz: function() {
      console.log("xyz");
    },
  },
}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
