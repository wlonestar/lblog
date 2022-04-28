let api = [];
const apiDocListSize = 1
api.push({
    name: 'default',
    order: '1',
    list: []
})
api[0].list.push({
    alias: 'ArticleController',
    order: '1',
    link: '文章接口',
    desc: '文章接口',
    list: []
})
api[0].list[0].list.push({
    order: '1',
    deprecated: 'false',
    url: 'http://localhost:8088/article/page/detail',
    desc: '分页查询文章详情',
});
api[0].list[0].list.push({
    order: '2',
    deprecated: 'false',
    url: 'http://localhost:8088/article/page/summary',
    desc: '分页查询文章摘要',
});
api[0].list[0].list.push({
    order: '3',
    deprecated: 'false',
    url: 'http://localhost:8088/article/all/detail',
    desc: '查询所有文章详情',
});
api[0].list[0].list.push({
    order: '4',
    deprecated: 'false',
    url: 'http://localhost:8088/article/all/summary',
    desc: '查询所有文章摘要',
});
api[0].list[0].list.push({
    order: '5',
    deprecated: 'false',
    url: 'http://localhost:8088/article/detail/id',
    desc: '根据 id 查询文章详情',
});
api[0].list[0].list.push({
    order: '6',
    deprecated: 'false',
    url: 'http://localhost:8088/article/detail/title',
    desc: '根据标题查询文章详情',
});
api[0].list[0].list.push({
    order: '7',
    deprecated: 'false',
    url: 'http://localhost:8088/article/summary',
    desc: '根据 id 查询文章摘要',
});
api[0].list[0].list.push({
    order: '8',
    deprecated: 'false',
    url: 'http://localhost:8088/article/',
    desc: '增加文章',
});
api[0].list[0].list.push({
    order: '9',
    deprecated: 'false',
    url: 'http://localhost:8088/article/',
    desc: '根据 id 更新文章',
});
api[0].list[0].list.push({
    order: '10',
    deprecated: 'false',
    url: 'http://localhost:8088/article/{id}',
    desc: '根据 id 删除文章',
});
api[0].list.push({
    alias: 'AuthController',
    order: '2',
    link: '认证接口',
    desc: '认证接口',
    list: []
})
api[0].list[1].list.push({
    order: '1',
    deprecated: 'false',
    url: 'http://localhost:8088/auth/login',
    desc: '登录',
});
api[0].list[1].list.push({
    order: '2',
    deprecated: 'false',
    url: 'http://localhost:8088/auth/register',
    desc: '注册',
});
api[0].list[1].list.push({
    order: '3',
    deprecated: 'false',
    url: 'http://localhost:8088/auth/check',
    desc: '验证是否登录',
});
api[0].list[1].list.push({
    order: '4',
    deprecated: 'false',
    url: 'http://localhost:8088/auth/logout',
    desc: '注销',
});
api[0].list.push({
    alias: 'CategoryController',
    order: '3',
    link: '分类接口',
    desc: '分类接口',
    list: []
})
api[0].list[2].list.push({
    order: '1',
    deprecated: 'false',
    url: 'http://localhost:8088/category/page',
    desc: '分页查询分类实体',
});
api[0].list[2].list.push({
    order: '2',
    deprecated: 'false',
    url: 'http://localhost:8088/category/all',
    desc: '查询所有分类实体',
});
api[0].list[2].list.push({
    order: '3',
    deprecated: 'false',
    url: 'http://localhost:8088/category/article/id',
    desc: '分页查询某分类下文章',
});
api[0].list[2].list.push({
    order: '4',
    deprecated: 'false',
    url: 'http://localhost:8088/category/article/name',
    desc: '分页查询某分类下文章',
});
api[0].list[2].list.push({
    order: '5',
    deprecated: 'false',
    url: 'http://localhost:8088/category/id',
    desc: '根据 id 查询分类实体',
});
api[0].list[2].list.push({
    order: '6',
    deprecated: 'false',
    url: 'http://localhost:8088/category/name',
    desc: '根据名称查询分类实体',
});
api[0].list[2].list.push({
    order: '7',
    deprecated: 'false',
    url: 'http://localhost:8088/category/',
    desc: '增加分类',
});
api[0].list[2].list.push({
    order: '8',
    deprecated: 'false',
    url: 'http://localhost:8088/category/{id}',
    desc: '根据 id 删除分类',
});
api[0].list.push({
    alias: 'CommentController',
    order: '4',
    link: '留言接口',
    desc: '留言接口',
    list: []
})
api[0].list[3].list.push({
    order: '1',
    deprecated: 'false',
    url: 'http://localhost:8088/comment/page',
    desc: '分页查询留言',
});
api[0].list[3].list.push({
    order: '2',
    deprecated: 'false',
    url: 'http://localhost:8088/comment/all',
    desc: '查询所有留言',
});
api[0].list[3].list.push({
    order: '3',
    deprecated: 'false',
    url: 'http://localhost:8088/comment/',
    desc: '根据 id 查询留言',
});
api[0].list[3].list.push({
    order: '4',
    deprecated: 'false',
    url: 'http://localhost:8088/comment/',
    desc: '增加留言',
});
api[0].list[3].list.push({
    order: '5',
    deprecated: 'false',
    url: 'http://localhost:8088/comment/{id}',
    desc: '根据 id 删除留言',
});
api[0].list.push({
    alias: 'ImageController',
    order: '5',
    link: '图片接口',
    desc: '图片接口',
    list: []
})
api[0].list[4].list.push({
    order: '1',
    deprecated: 'false',
    url: 'http://localhost:8088/files/all',
    desc: '获取已上传的图片列表',
});
api[0].list[4].list.push({
    order: '2',
    deprecated: 'false',
    url: 'http://localhost:8088/files/page',
    desc: '分页查询',
});
api[0].list[4].list.push({
    order: '3',
    deprecated: 'false',
    url: 'http://localhost:8088/files/upload',
    desc: '图片上传',
});
api[0].list.push({
    alias: 'TagController',
    order: '6',
    link: '标签接口',
    desc: '标签接口',
    list: []
})
api[0].list[5].list.push({
    order: '1',
    deprecated: 'false',
    url: 'http://localhost:8088/tag/page',
    desc: '分页查询标签实体',
});
api[0].list[5].list.push({
    order: '2',
    deprecated: 'false',
    url: 'http://localhost:8088/tag/all',
    desc: '查询所有标签实体',
});
api[0].list[5].list.push({
    order: '3',
    deprecated: 'false',
    url: 'http://localhost:8088/tag/article/id',
    desc: '分页查询某标签下文章',
});
api[0].list[5].list.push({
    order: '4',
    deprecated: 'false',
    url: 'http://localhost:8088/tag/article/name',
    desc: '分页查询某标签下文章',
});
api[0].list[5].list.push({
    order: '5',
    deprecated: 'false',
    url: 'http://localhost:8088/tag/id',
    desc: '根据 id 查询标签实体',
});
api[0].list[5].list.push({
    order: '6',
    deprecated: 'false',
    url: 'http://localhost:8088/tag/name',
    desc: '根据名称查询标签实体',
});
api[0].list[5].list.push({
    order: '7',
    deprecated: 'false',
    url: 'http://localhost:8088/tag/',
    desc: '增加标签',
});
api[0].list[5].list.push({
    order: '8',
    deprecated: 'false',
    url: 'http://localhost:8088/tag/{id}',
    desc: '根据 id 删除标签',
});
api[0].list.push({
    alias: 'TimelineController',
    order: '7',
    link: '时间线接口',
    desc: '时间线接口',
    list: []
})
api[0].list[6].list.push({
    order: '1',
    deprecated: 'false',
    url: 'http://localhost:8088/idea/page',
    desc: '分页查询时间线',
});
api[0].list[6].list.push({
    order: '2',
    deprecated: 'false',
    url: 'http://localhost:8088/idea/all',
    desc: '查询所有时间线',
});
api[0].list[6].list.push({
    order: '3',
    deprecated: 'false',
    url: 'http://localhost:8088/idea/',
    desc: '根据 id 查询时间线',
});
api[0].list[6].list.push({
    order: '4',
    deprecated: 'false',
    url: 'http://localhost:8088/idea/',
    desc: '增加时间线',
});
api[0].list[6].list.push({
    order: '5',
    deprecated: 'false',
    url: 'http://localhost:8088/idea/',
    desc: '更新时间线',
});
api[0].list[6].list.push({
    order: '6',
    deprecated: 'false',
    url: 'http://localhost:8088/idea/{id}',
    desc: '根据 id 删除时间线',
});
api[0].list.push({
    alias: 'UserController',
    order: '8',
    link: '用户接口',
    desc: '用户接口',
    list: []
})
api[0].list[7].list.push({
    order: '1',
    deprecated: 'false',
    url: 'http://localhost:8088/user/user',
    desc: '根据 id 获取用户信息',
});
api[0].list[7].list.push({
    order: '2',
    deprecated: 'false',
    url: 'http://localhost:8088/user/',
    desc: '添加用户',
});
api[0].list[7].list.push({
    order: '3',
    deprecated: 'false',
    url: 'http://localhost:8088/user/',
    desc: '更新用户信息',
});
document.onkeydown = keyDownSearch;
function keyDownSearch(e) {
    const theEvent = e;
    const code = theEvent.keyCode || theEvent.which || theEvent.charCode;
    if (code == 13) {
        const search = document.getElementById('search');
        const searchValue = search.value.toLocaleLowerCase();

        let searchGroup = [];
        for (let i = 0; i < api.length; i++) {

            let apiGroup = api[i];

            let searchArr = [];
            for (let i = 0; i < apiGroup.list.length; i++) {
                let apiData = apiGroup.list[i];
                const desc = apiData.desc;
                if (desc.toLocaleLowerCase().indexOf(searchValue) > -1) {
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
                        if (methodDesc.toLocaleLowerCase().indexOf(searchValue) > -1) {
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
            if (apiGroup.name.toLocaleLowerCase().indexOf(searchValue) > -1) {
                searchGroup.push({
                    name: apiGroup.name,
                    order: apiGroup.order,
                    list: searchArr
                });
                continue;
            }
            if (searchArr.length === 0) {
                continue;
            }
            searchGroup.push({
                name: apiGroup.name,
                order: apiGroup.order,
                list: searchArr
            });
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
            html = buildAccordion(searchGroup,liClass,display);
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

function buildAccordion(apiGroups, liClass, display) {
    let html = "";
    let doc;
    if (apiGroups.length > 0) {
         if (apiDocListSize == 1) {
            let apiData = apiGroups[0].list;
            for (let j = 0; j < apiData.length; j++) {
                html += '<li class="'+liClass+'">';
                html += '<a class="dd" href="#_' + apiData[j].link + '">' + apiData[j].order + '.&nbsp;' + apiData[j].desc + '</a>';
                html += '<ul class="sectlevel2" style="'+display+'">';
                doc = apiData[j].list;
                for (let m = 0; m < doc.length; m++) {
                    let spanString;
                    if (doc[m].deprecated == 'true') {
                        spanString='<span class="line-through">';
                    } else {
                        spanString='<span>';
                    }
                    html += '<li><a href="#_1_' + apiData[j].order + '_' + doc[m].order + '_' + doc[m].desc + '">' + apiData[j].order + '.' + doc[m].order + '.&nbsp;' + spanString + doc[m].desc + '<span></a> </li>';
                }
                html += '</ul>';
                html += '</li>';
            }
        } else {
            for (let i = 0; i < apiGroups.length; i++) {
                let apiGroup = apiGroups[i];
                html += '<li class="'+liClass+'">';
                html += '<a class="dd" href="#_' + apiGroup.name + '">' + apiGroup.order + '.&nbsp;' + apiGroup.name + '</a>';
                html += '<ul class="sectlevel1">';

                let apiData = apiGroup.list;
                for (let j = 0; j < apiData.length; j++) {
                    html += '<li class="'+liClass+'">';
                    html += '<a class="dd" href="#_'+apiGroup.order+'_'+ apiData[j].order + '_'+ apiData[j].link + '">' +apiGroup.order+'.'+ apiData[j].order + '.&nbsp;' + apiData[j].desc + '</a>';
                    html += '<ul class="sectlevel2" style="'+display+'">';
                    doc = apiData[j].list;
                    for (let m = 0; m < doc.length; m++) {
                       let spanString;
                       if (doc[m].deprecated == 'true') {
                           spanString='<span class="line-through">';
                       } else {
                           spanString='<span>';
                       }
                       html += '<li><a href="#_'+apiGroup.order+'_' + apiData[j].order + '_' + doc[m].order + '_' + doc[m].desc + '">'+apiGroup.order+'.' + apiData[j].order + '.' + doc[m].order + '.&nbsp;' + spanString + doc[m].desc + '<span></a> </li>';
                   }
                    html += '</ul>';
                    html += '</li>';
                }

                html += '</ul>';
                html += '</li>';
            }
        }
    }
    return html;
}