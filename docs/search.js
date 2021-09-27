let api = [];
api.push({
    alias: 'ArticleController',
    order: '1',
    link: '文章',
    desc: '文章',
    list: []
})
api[0].list.push({
    order: '1',
    desc: '分页查询文章',
});
api[0].list.push({
    order: '2',
    desc: '查询所有文章',
});
api[0].list.push({
    order: '3',
    desc: '根据id查询文章',
});
api[0].list.push({
    order: '4',
    desc: '根据标题查询文章',
});
api[0].list.push({
    order: '5',
    desc: '增加文章',
});
api[0].list.push({
    order: '6',
    desc: '根据id更新文章',
});
api[0].list.push({
    order: '7',
    desc: '根据id删除文章',
});
api.push({
    alias: 'CategoryController',
    order: '2',
    link: '分类',
    desc: '分类',
    list: []
})
api[1].list.push({
    order: '1',
    desc: '分页查询分类',
});
api[1].list.push({
    order: '2',
    desc: '查询所有分类',
});
api[1].list.push({
    order: '3',
    desc: '根据id查询分类',
});
api[1].list.push({
    order: '4',
    desc: '根据名称查询分类',
});
api[1].list.push({
    order: '5',
    desc: '增加分类',
});
api[1].list.push({
    order: '6',
    desc: '根据id更新分类',
});
api[1].list.push({
    order: '7',
    desc: '根据id删除分类',
});
api.push({
    alias: 'CommentController',
    order: '3',
    link: '留言',
    desc: '留言',
    list: []
})
api[2].list.push({
    order: '1',
    desc: '分页查询留言',
});
api[2].list.push({
    order: '2',
    desc: '查询所有留言',
});
api[2].list.push({
    order: '3',
    desc: '根据id查询留言',
});
api[2].list.push({
    order: '4',
    desc: '增加留言',
});
api[2].list.push({
    order: '5',
    desc: '更新留言',
});
api[2].list.push({
    order: '6',
    desc: '根据id删除留言',
});
api[2].list.push({
    order: '7',
    desc: '删除所有留言',
});
api.push({
    alias: 'ImageController',
    order: '4',
    link: '图片',
    desc: '图片',
    list: []
})
api[3].list.push({
    order: '1',
    desc: '获取已上传的图片列表',
});
api[3].list.push({
    order: '2',
    desc: '分页查询',
});
api[3].list.push({
    order: '3',
    desc: '图片上传',
});
api[3].list.push({
    order: '4',
    desc: '图片下载',
});
api.push({
    alias: 'LinkController',
    order: '5',
    link: '友链',
    desc: '友链',
    list: []
})
api[4].list.push({
    order: '1',
    desc: '获取所有友链',
});
api.push({
    alias: 'LoginController',
    order: '6',
    link: '登录',
    desc: '登录',
    list: []
})
api[5].list.push({
    order: '1',
    desc: '登录',
});
api[5].list.push({
    order: '2',
    desc: '注销',
});
api.push({
    alias: 'TimelineController',
    order: '7',
    link: '时间线',
    desc: '时间线',
    list: []
})
api[6].list.push({
    order: '1',
    desc: '分页查询动态',
});
api[6].list.push({
    order: '2',
    desc: '查询所有动态',
});
api[6].list.push({
    order: '3',
    desc: '根据id查询动态',
});
api[6].list.push({
    order: '4',
    desc: '增加动态',
});
api[6].list.push({
    order: '5',
    desc: '更新动态',
});
api[6].list.push({
    order: '6',
    desc: '根据id删除动态',
});
api[6].list.push({
    order: '7',
    desc: '删除所有动态',
});
api.push({
    alias: 'UserController',
    order: '8',
    link: '用户',
    desc: '用户',
    list: []
})
api[7].list.push({
    order: '1',
    desc: '添加用户',
});
api[7].list.push({
    order: '2',
    desc: '根据id获取用户信息',
});
api[7].list.push({
    order: '3',
    desc: '根据用户名获取用户信息',
});
api[7].list.push({
    order: '4',
    desc: '更新密码',
});
api.push({
    alias: 'dict',
    order: '9',
    link: 'dict_list',
    desc: '数据字典',
    list: []
})
document.onkeydown = keyDownSearch;
function keyDownSearch(e) {
    const theEvent = e;
    const code = theEvent.keyCode || theEvent.which || theEvent.charCode;
    if (code == 13) {
        const search = document.getElementById('search');
        const searchValue = search.value;
        let searchArr = [];
        for (let i = 0; i < api.length; i++) {
            let apiData = api[i];
            const desc = apiData.desc;
            if (desc.indexOf(searchValue) > -1) {
                searchArr.push({
                    order: apiData.order,
                    desc: apiData.desc,
                    link: apiData.link,
                    list: apiData.list
                });
            } else {
                let methodList = apiData.list || [];
                let methodListTemp = [];
                for (let j = 0; j < methodList.length; j++) {
                    const methodData = methodList[j];
                    const methodDesc = methodData.desc;
                    if (methodDesc.indexOf(searchValue) > -1) {
                        methodListTemp.push(methodData);
                        break;
                    }
                }
                if (methodListTemp.length > 0) {
                    const data = {
                        order: apiData.order,
                        desc: apiData.desc,
                        link: apiData.link,
                        list: methodListTemp
                    };
                    searchArr.push(data);
                }
            }
        }
        let html;
        if (searchValue == '') {
            const liClass = "";
            const display = "display: none";
            html = buildAccordion(api,liClass,display);
            document.getElementById('accordion').innerHTML = html;
        } else {
            const liClass = "open";
            const display = "display: block";
            html = buildAccordion(searchArr,liClass,display);
            document.getElementById('accordion').innerHTML = html;
        }
        const Accordion = function (el, multiple) {
            this.el = el || {};
            this.multiple = multiple || false;
            const links = this.el.find('.dd');
            links.on('click', {el: this.el, multiple: this.multiple}, this.dropdown);
        };
        Accordion.prototype.dropdown = function (e) {
            const $el = e.data.el;
            $this = $(this), $next = $this.next();
            $next.slideToggle();
            $this.parent().toggleClass('open');
            if (!e.data.multiple) {
                $el.find('.submenu').not($next).slideUp("20").parent().removeClass('open');
            }
        };
        new Accordion($('#accordion'), false);
    }
}

function buildAccordion(apiData, liClass, display) {
    let html = "";
    let doc;
    if (apiData.length > 0) {
        for (let j = 0; j < apiData.length; j++) {
            html += '<li class="'+liClass+'">';
            html += '<a class="dd" href="#_' + apiData[j].link + '">' + apiData[j].order + '.&nbsp;' + apiData[j].desc + '</a>';
            html += '<ul class="sectlevel2" style="'+display+'">';
            doc = apiData[j].list;
            for (let m = 0; m < doc.length; m++) {
                html += '<li><a href="#_' + apiData[j].order + '_' + doc[m].order + '_' + doc[m].desc + '">' + apiData[j].order + '.' + doc[m].order + '.&nbsp;' + doc[m].desc + '</a> </li>';
            }
            html += '</ul>';
            html += '</li>';
        }
    }
    return html;
}