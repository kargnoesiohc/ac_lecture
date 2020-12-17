import Vue from 'vue';
import VueRouter from 'vue-router';

import Bar from './components/Bar.vue';
import Foo from './components/Foo.vue';
import NotFound from './components/NotFound.vue';
import Knu from './components/Knu.vue';
import Baz from './components/Baz.vue';


Vue.use(VueRouter);

const routes = [
    {path:'/', components:Bar, name:'Bar'},
    {path:'/login/:id', components:Foo, name:'Foo', props:true},//속성 이름 사용
    {path:'/my/:pw', components:Baz, name:'Baz', props:true},//속성 이름 사용
    {path:'/knu', components:Knu, name:'Knu', props:{username:'강감찬'}},//속성 이름 사용
    {path:'/*', components:NotFound, name:'NotFound'},
]

const router = new VueRouter({routes});
export default router;
