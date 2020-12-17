<template>
  <div class="hello">
    값 : {{num}}
    {{xxx()}}{{xxx()}}{{xxx()}}
    {{yyy}}{{yyy}}{{yyy}}
    {{change()}}
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
     num:30,
    }
  },
  //기본적으로 함수는 매번 호출 됨
  methods: {
    xxx:function() {
      console.log("xxx method 호출 됨", this.num);
    },
    change:function() {
      this.num = 40;
    }
  },
  //반응형 getter, 속성처럼 사용 가능 {{속성명}}, 데이터 캐싱처리 되어 한번만 호출 됨
  computed: {
    yyy:function() {
      console.log("yyy computed 호출 됨", this.num);
      return ""; //리턴값이 필요함
    }
  }
}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
