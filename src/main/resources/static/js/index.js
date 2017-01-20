/**
 * Created by graal on 20.01.2017.
 */
// import Lodash from 'lodash';
import Vue from 'vue';

// function component () {
//     // var element = document.createElement('div');
//     //
//     // /* lodash is required for the next line to work */
//     // element.innerHTML = _.join(['Hello','webpack'], ' ');
//     //
//     // return element;
//
//
// }
//
// document.body.appendChild(component());

var app = new Vue({
    el:'#app',
    data:{
        message:'Hello Vue!'
    }
});